package com.app.appchallenge.adapters;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.appchallenge.R;
import com.app.appchallenge.database.entity.pojos.Category;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>  {

    private Context context;
    private List<Category> categoryList;
    private int lastPosition = -1;

    public CategoriesAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_categories, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        setFadeAnimation(holder.layCategories, position);
        holder.txCat.setText(categoryList.get(position).getName());

        Picasso.get().load(categoryList.get(position).getLogo().getUrl()).into(holder.imgCat);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public void setFadeAnimation(View view, int position) {
        Animation anim =  AnimationUtils.loadAnimation(context, R.anim.item_animation_from_right);
        view.startAnimation(anim);
        lastPosition = position;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.txCat)
        TextView txCat;
        @BindView(R.id.imgCat)
        ImageView imgCat;
        @BindView(R.id.layCategories)
        RelativeLayout layCategories;

        public MyViewHolder(View view){
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
