package com.app.appchallenge.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.app.appchallenge.R;
import com.app.appchallenge.database.entity.pojos.Shop;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class EditorListAdapter extends RecyclerView.Adapter<EditorListAdapter.MyViewHolder> {

    private Context context;
    private List<Shop> shopList;

    public EditorListAdapter(Context context, List<Shop> shopList) {
        this.context = context;
        this.shopList = shopList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_list_all_editor, viewGroup, false);
        ButterKnife.bind(view);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        if(shopList.get(position).getCover() != null){
            Picasso.get().load(shopList.get(position).getCover().getUrl()).into(holder.imgVit);
        }else{
            Picasso.get().load(R.drawable.no_cover).into(holder.imgVit);
        }

        if (shopList.get(position).getLogo() != null){
            Picasso.get().load(shopList.get(position).getLogo().getUrl()).into(holder.imgVitLog);
        }else{
            Picasso.get().load(R.drawable.no_logo).into(holder.imgVitLog);
            holder.txNoLogo.setText(shopList.get(position).getName().substring(0, 1));
        }

        holder.txNewVitMain.setText(shopList.get(position).getName());
        holder.txNewVitSub.setText(shopList.get(position).getDefinition());
        holder.txNewVitEsya.setText(context.getString(R.string.item, shopList.get(position).getProductCount()));
    }

    @Override
    public int getItemCount() {
        return shopList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.imgVit)
        ImageView imgVit;

        @BindView(R.id.imgVitLog)
        CircleImageView imgVitLog;

        @BindView(R.id.txNewVitMain)
        TextView txNewVitMain;

        @BindView(R.id.txNewVitSub)
        TextView txNewVitSub;

        @BindView(R.id.txNewVitEsya)
        TextView txNewVitEsya;

        @BindView(R.id.txNoLogo)
        TextView txNoLogo;

        public MyViewHolder(View view){
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
