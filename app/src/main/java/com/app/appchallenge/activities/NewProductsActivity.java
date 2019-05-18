package com.app.appchallenge.activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.app.appchallenge.R;
import com.app.appchallenge.adapters.NewsAdapter;
import com.app.appchallenge.database.entity.pojos.Product;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewProductsActivity extends AppCompatActivity {

    @BindView(R.id.tbNewProducts)
    Toolbar tbNewProducts;

    @BindView(R.id.recycNewProducts)
    RecyclerView recycNewProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_products);
        ButterKnife.bind(this);
        setupToolbar();

        Intent i = getIntent();
        List<Product> list = (List<Product>) i.getSerializableExtra("newProducts");
        recycNewProducts.setLayoutManager(new GridLayoutManager(this, 2));
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_animation_from_bottom);
        recycNewProducts.setLayoutAnimation(animation);
        recycNewProducts.setAdapter(new NewsAdapter(getApplicationContext(), list));
    }

    private void setupToolbar() {
        setSupportActionBar(tbNewProducts);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.activity_animation_reverse_slide_from_right, R.anim.activity_animation_reverse_slide_from_left);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.activity_animation_reverse_slide_from_right, R.anim.activity_animation_reverse_slide_from_left);

        super.onBackPressed();

    }
}
