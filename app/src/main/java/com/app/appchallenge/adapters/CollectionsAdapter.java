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
import com.app.appchallenge.database.entity.pojos.Collection;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CollectionsAdapter extends RecyclerView.Adapter<CollectionsAdapter.MyViewHolder> {

    private Context context;
    private List<Collection> collectionList;

    public CollectionsAdapter(Context context, List<Collection> collectionList) {
        this.context = context;
        this.collectionList = collectionList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_collection_list, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txColMain.setText(collectionList.get(position).getTitle());
        holder.txColSub.setText(collectionList.get(position).getDefinition());
        Picasso.get().load(collectionList.get(position).getCover().getUrl()).into(holder.imgCol);
    }

    @Override
    public int getItemCount() {
        return collectionList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.txColMain)
        TextView txColMain;
        @BindView(R.id.txColSub)
        TextView txColSub;
        @BindView(R.id.imgCol)
        ImageView imgCol;

        public MyViewHolder(View view){
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
