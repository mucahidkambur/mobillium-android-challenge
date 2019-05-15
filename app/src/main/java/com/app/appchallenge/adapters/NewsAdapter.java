package com.app.appchallenge.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.appchallenge.R;
import com.app.appchallenge.database.entity.pojos.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    private Context context;
    private List<Product> productResults;

    public NewsAdapter(Context context, List<Product> productResults) {
        this.context = context;
        this.productResults = productResults;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_new_slider, viewGroup, false);
        ButterKnife.bind(view);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
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

        public MyViewHolder(View view){
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
