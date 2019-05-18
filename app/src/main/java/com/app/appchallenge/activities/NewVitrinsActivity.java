package com.app.appchallenge.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.app.appchallenge.R;
import com.app.appchallenge.adapters.EditorListAdapter;
import com.app.appchallenge.database.entity.pojos.Shop;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewVitrinsActivity extends AppCompatActivity {

    @BindView(R.id.tbNewVit)
    Toolbar tbNewVit;

    @BindView(R.id.recycNewVit)
    RecyclerView recycNewVit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_vitrins);
        ButterKnife.bind(this);

        Intent i = getIntent();
        List<Shop> list = (List<Shop>) i.getSerializableExtra("vit");
        recycNewVit.setLayoutManager(new LinearLayoutManager(this));
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_animation_from_bottom);
        recycNewVit.setLayoutAnimation(animation);
        recycNewVit.setAdapter(new EditorListAdapter(getApplicationContext(), list));

        setupToolbar();
    }

    private void setupToolbar() {
        setSupportActionBar(tbNewVit);

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
