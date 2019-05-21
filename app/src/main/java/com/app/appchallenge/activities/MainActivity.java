package com.app.appchallenge.activities;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.speech.RecognizerIntent;

import com.airbnb.lottie.LottieAnimationView;
import com.app.appchallenge.helper.ParallaxPageTransformer;
import com.google.android.material.tabs.TabLayout;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.app.appchallenge.R;
import com.app.appchallenge.adapters.CategoriesAdapter;
import com.app.appchallenge.adapters.CollectionsAdapter;
import com.app.appchallenge.adapters.EditorListPagerAdapter;
import com.app.appchallenge.adapters.FeaturedAdapter;
import com.app.appchallenge.adapters.NewVitrinAdapter;
import com.app.appchallenge.adapters.NewsAdapter;
import com.app.appchallenge.database.entity.pojos.Collection;
import com.app.appchallenge.database.entity.pojos.Product;
import com.app.appchallenge.database.entity.pojos.Shop;
import com.app.appchallenge.database.entity.pojos.VitrinResult;
import com.app.appchallenge.viewmodel.DataViewModel;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.searchView)
    SimpleSearchView searchView;

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @BindView(R.id.vPagerVitrin)
    ViewPager vPagerVitrin;

    @BindView(R.id.vPagerNew)
    ViewPager vPagerNew;

    @BindView(R.id.indicator)
    TabLayout indicator;

    @BindView(R.id.recycNew)
    RecyclerView recycNew;

    @BindView(R.id.recycCat)
    RecyclerView recycCat;

    @BindView(R.id.recycCol)
    RecyclerView recycCol;

    @BindView(R.id.linNewItems)
    LinearLayout linNewItems;

    @BindView(R.id.linEditorVit)
    LinearLayout linEditorVit;

    @BindView(R.id.linCol)
    LinearLayout linCol;

    @BindView(R.id.linLoad)
    LinearLayout linLoad;

    @BindView(R.id.linVitNew)
    LinearLayout linVitNew;

    @BindView(R.id.loadAnim)
    LottieAnimationView loadAnim;

    @BindView(R.id.imgVitBack)
    ImageView imgVitBack;

    @BindView(R.id.swipeContainer)
    SwipeRefreshLayout swipeContainer;

    List<Product> productList;
    List<Collection> collectionList;
    List<Shop> editorShopList;
    List<Shop> vitrinShopList;

    DataViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initToolbar();

        setupRecyclerView(recycNew);
        setupRecyclerView(recycCat);
        setupRecyclerView(recycCol);

        linNewItems.setOnClickListener(this);
        linCol.setOnClickListener(this);
        linEditorVit.setOnClickListener(this);
        linVitNew.setOnClickListener(this);

        observableViewModel();

        viewPager.setPageTransformer(false, new ParallaxPageTransformer());
        indicator.setupWithViewPager(viewPager, true);

        vPagerVitrin.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                Picasso.get().load(editorShopList.get(i).getCover().getUrl()).noPlaceholder().into(imgVitBack);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                viewModel.refreshData();
                linLoad.setVisibility(View.INVISIBLE);
            }
        });

    }

    private void observableViewModel(){

        viewModel = ViewModelProviders.of(this).get(DataViewModel.class);

        viewModel.getLoading().observe(this, isLoading -> {
            if (isLoading != null){
                loadAnim.setVisibility(View.GONE);
                if (isLoading){
                    swipeContainer.setRefreshing(false);
                    linLoad.setVisibility(View.VISIBLE);
                }
            }
        });

        viewModel.getDatas().observe(this, (Observer<List<VitrinResult>>) vitrinResults -> {
            if (vitrinResults != null){
                //buradaki list ler recyc lerdeki ile aynı olsun
                productList = vitrinResults.get(1).getProducts();
                collectionList = vitrinResults.get(3).getCollections();
                editorShopList = vitrinResults.get(4).getShops();
                vitrinShopList = vitrinResults.get(5).getShops();

                viewPager.setAdapter(new FeaturedAdapter(this, vitrinResults.get(0).getFeatured()));
                recycNew.setAdapter(new NewsAdapter(this, vitrinResults.get(1).getProducts()));
                recycCat.setAdapter(new CategoriesAdapter(this, vitrinResults.get(2).getCategories()));
                recycCol.setAdapter(new CollectionsAdapter(this, vitrinResults.get(3).getCollections()));
                vPagerVitrin.setAdapter(new EditorListPagerAdapter(this, vitrinResults.get(4).getShops()));
                vPagerVitrin.setClipToPadding(false);
                vPagerVitrin.setPadding(100, 0, 100, 0);
                vPagerNew.setAdapter(new NewVitrinAdapter(this, vitrinResults.get(5).getShops()));
                vPagerNew.setClipToPadding(false);
                vPagerNew.setPadding(50, 0, 0, 0);

                Picasso.get().load(editorShopList.get(0).getCover().getUrl()).into(imgVitBack);
            }
        });
    }

    private void setupRecyclerView(RecyclerView recyclerView){
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_animation_slide_right);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setLayoutAnimation(animation);
        recyclerView.scheduleLayoutAnimation();
    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
        searchView.setVisibility(View.VISIBLE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (searchView.onActivityResult(requestCode, resultCode, data)) {
            ArrayList<String> datas = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            searchView.setQuery(datas.get(0), false);
            return;
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.linNewItems:
                Intent intentNewItem = new Intent(getApplicationContext(), NewProductsActivity.class);
                intentNewItem.putExtra("newProducts", (Serializable) productList);
                startActivity(intentNewItem);
                overridePendingTransition(R.anim.activity_animation_slide_from_right, R.anim.activity_animation_slide_from_left);
                break;
            case R.id.linCol:
                Intent intentCol = new Intent(getApplicationContext(), CollectionsActivity.class);
                intentCol.putExtra("coll", (Serializable) collectionList);
                startActivity(intentCol);
                overridePendingTransition(R.anim.activity_animation_slide_from_right, R.anim.activity_animation_slide_from_left);
                break;
            case R.id.linEditorVit:
                Intent intentEditor = new Intent(getApplicationContext(), EditorVitrinActivity.class);
                intentEditor.putExtra("editor", (Serializable) editorShopList);
                startActivity(intentEditor);
                overridePendingTransition(R.anim.activity_animation_slide_from_right, R.anim.activity_animation_slide_from_left);
                break;
            case R.id.linVitNew:
                Intent intentVit = new Intent(getApplicationContext(), NewVitrinsActivity.class);
                intentVit.putExtra("vit", (Serializable) vitrinShopList );
                startActivity(intentVit);
                overridePendingTransition(R.anim.activity_animation_slide_from_right, R.anim.activity_animation_slide_from_left);
                break;
        }
    }

}
