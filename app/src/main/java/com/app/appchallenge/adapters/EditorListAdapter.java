package com.app.appchallenge.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
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

public class EditorListAdapter extends PagerAdapter {

    @BindView(R.id.imgELogo)
    CircleImageView imgCircle;

    @BindView(R.id.imgOne)
    ImageView imageView1;

    @BindView(R.id.imgTwo)
    ImageView imageView2;

    @BindView(R.id.imgThree)
    ImageView imageView3;

    @BindView(R.id.txEMain)
    TextView txEMain;

    @BindView(R.id.txESub)
    TextView txEsub;

    private Context context;
    private List<Shop> editorList;
    private LayoutInflater layoutInflater;

    public interface backgroundListener{
        void changeBackground();
    }

    public EditorListAdapter(Context context, List<Shop> editorList) {
        this.context = context;
        this.editorList = editorList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_list_editor, container, false);
        ButterKnife.bind(this, view);

        txEMain.setText(editorList.get(position).getName());
        txEsub.setText(editorList.get(position).getDefinition());
        Picasso.get().load(editorList.get(position).getLogo().getUrl()).into(imgCircle);
        Picasso.get().load(editorList.get(position).getProductList().get(0).getImages().get(0).getUrl()).into(imageView1);
        Picasso.get().load(editorList.get(position).getProductList().get(1).getImages().get(0).getUrl()).into(imageView2);
        Picasso.get().load(editorList.get(position).getProductList().get(2).getImages().get(0).getUrl()).into(imageView3);

        container.addView(view, 0);
        return view;
    }

    @Override
    public int getCount() {
        return editorList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
