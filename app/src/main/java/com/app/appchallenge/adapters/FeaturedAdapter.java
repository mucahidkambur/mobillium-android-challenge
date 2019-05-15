package com.app.appchallenge.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.appchallenge.R;
import com.app.appchallenge.database.entity.pojos.Featured;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FeaturedAdapter extends PagerAdapter {

    private Context context;

    @BindView(R.id.imgFBack)
    ImageView imgFeaBack;

    @BindView(R.id.txFMain)
    TextView txMain;

    @BindView(R.id.txFSub)
    TextView txSub;

    private List<Featured> featuredList;

    public FeaturedAdapter(Context context, List<Featured> featuredList) {
        this.context = context;
        this.featuredList = featuredList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_featured, container, false);
        ButterKnife.bind(this, view);

        txMain.setText(featuredList.get(position).getTitle());
        txSub.setText(featuredList.get(position).getSubTitle());
        Picasso.get().load(featuredList.get(position).getCover().getUrl()).into(imgFeaBack);

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);
        return view;
    }

    @Override
    public int getCount() {
        return featuredList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
