package com.app.appchallenge.adapters;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.appchallenge.R;
import com.app.appchallenge.activities.MainActivity;
import com.app.appchallenge.database.entity.pojos.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    private Context context;
    private List<Product> productResults;
    private int lastPosition = -1;

    public NewsAdapter(Context context, List<Product> productResults) {
        this.context = context;
        this.productResults = productResults;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;

        if(context instanceof MainActivity){
            view = LayoutInflater.from(context).inflate(R.layout.item_new_slider, viewGroup, false);
        }else{
            view = LayoutInflater.from(context).inflate(R.layout.item_new_slider_all, viewGroup, false);
        }

        ButterKnife.bind(view);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        setFadeAnimation(holder.layNewSliderMain, position);
        holder.txNewMain.setText(productResults.get(position).getTitle());
        holder.txNewSub.setText(productResults.get(position).getShop().getName());
        holder.txNewMon.setText(context.getString(R.string.txMoneyNew, productResults.get(position).getPrice()));
        holder.txNewOld.setText(context.getString(R.string.txNewOld, productResults.get(position).getOldPrice()));

        Picasso.get().load(productResults.get(position).getImages().get(0).getUrl()).into(holder.imgPic);
    }

    @Override
    public int getItemCount() {
        return productResults.size();
    }

    public void setFadeAnimation(View view, int position) {
        Animation anim =  AnimationUtils.loadAnimation(context, R.anim.item_animation_from_right);
        view.startAnimation(anim);
        lastPosition = position;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.txNewMain)
        TextView txNewMain;

        @BindView(R.id.txNewSub)
        TextView txNewSub;

        @BindView(R.id.txNewMon)
        TextView txNewMon;

        @BindView(R.id.txNewOld)
        TextView txNewOld;

        @BindView(R.id.imgNewPic)
        ImageView imgPic;

        @BindView(R.id.layNewSliderMain)
        CardView layNewSliderMain;

        public MyViewHolder(View view){
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
