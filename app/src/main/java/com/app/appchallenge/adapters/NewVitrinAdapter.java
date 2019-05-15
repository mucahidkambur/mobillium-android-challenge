package com.app.appchallenge.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.appchallenge.R;
import com.app.appchallenge.database.entity.pojos.Shop;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class NewVitrinAdapter  extends PagerAdapter {

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

    private Context context;
    private List<Shop> newVitrinList;
    private LayoutInflater layoutInflater;


    public NewVitrinAdapter(Context context, List<Shop> newVitrin) {
        this.context = context;
        this.newVitrinList = newVitrin;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_new_list, container, false);
        ButterKnife.bind(this, view);

        if(newVitrinList.get(position).getCover() != null){
            Picasso.get().load(newVitrinList.get(position).getCover().getUrl()).into(imgVit);
        }
        if (newVitrinList.get(position).getLogo() != null){
            Picasso.get().load(newVitrinList.get(position).getLogo().getUrl()).into(imgVitLog);
        }

        txNewVitMain.setText(newVitrinList.get(position).getName());
        txNewVitSub.setText(newVitrinList.get(position).getDefinition());
        txNewVitEsya.setText(context.getString(R.string.item, newVitrinList.get(position).getProductCount()));

        container.addView(view, 0);
        return view;
    }


    @Override
    public int getCount() {
        return newVitrinList.size();
    }

    @Override
    public float getPageWidth(final int position) {
        return 0.8f;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }
}
