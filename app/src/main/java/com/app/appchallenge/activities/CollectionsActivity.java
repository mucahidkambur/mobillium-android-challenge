package com.app.appchallenge.activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.app.appchallenge.R;
import com.app.appchallenge.adapters.CollectionsAdapter;
import com.app.appchallenge.database.entity.pojos.Collection;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CollectionsActivity extends AppCompatActivity {

    @BindView(R.id.tbCl)
    Toolbar tbCl;

    @BindView(R.id.recycCollections)
    RecyclerView recycCollections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);
        ButterKnife.bind(this);

        Intent i = getIntent();
        List<Collection> list = (List<Collection>) i.getSerializableExtra("coll");
        recycCollections.setLayoutManager(new LinearLayoutManager(this));
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_animation_from_bottom);
        recycCollections.setLayoutAnimation(animation);
        recycCollections.setAdapter(new CollectionsAdapter(getApplicationContext(), list));

        setupToolbar();
    }

    private void setupToolbar() {
        setSupportActionBar(tbCl);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.activity_animation_slide_from_right, R.anim.activity_animation_slide_from_left);
        }

        return super.onOptionsItemSelected(item);
    }
}
