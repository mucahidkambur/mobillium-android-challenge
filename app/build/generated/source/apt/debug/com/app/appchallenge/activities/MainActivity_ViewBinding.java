// Generated code from Butter Knife. Do not modify!
package com.app.appchallenge.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.app.appchallenge.R;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.searchView = Utils.findRequiredViewAsType(source, R.id.searchView, "field 'searchView'", SimpleSearchView.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'viewPager'", ViewPager.class);
    target.vPagerVitrin = Utils.findRequiredViewAsType(source, R.id.vPagerVitrin, "field 'vPagerVitrin'", ViewPager.class);
    target.vPagerNew = Utils.findRequiredViewAsType(source, R.id.vPagerNew, "field 'vPagerNew'", ViewPager.class);
    target.indicator = Utils.findRequiredViewAsType(source, R.id.indicator, "field 'indicator'", TabLayout.class);
    target.recycNew = Utils.findRequiredViewAsType(source, R.id.recycNew, "field 'recycNew'", RecyclerView.class);
    target.recycCat = Utils.findRequiredViewAsType(source, R.id.recycCat, "field 'recycCat'", RecyclerView.class);
    target.recycCol = Utils.findRequiredViewAsType(source, R.id.recycCol, "field 'recycCol'", RecyclerView.class);
    target.linNewItems = Utils.findRequiredViewAsType(source, R.id.linNewItems, "field 'linNewItems'", LinearLayout.class);
    target.linEditorVit = Utils.findRequiredViewAsType(source, R.id.linEditorVit, "field 'linEditorVit'", LinearLayout.class);
    target.linCol = Utils.findRequiredViewAsType(source, R.id.linCol, "field 'linCol'", LinearLayout.class);
    target.linLoad = Utils.findRequiredViewAsType(source, R.id.linLoad, "field 'linLoad'", LinearLayout.class);
    target.linVitNew = Utils.findRequiredViewAsType(source, R.id.linVitNew, "field 'linVitNew'", LinearLayout.class);
    target.loadAnim = Utils.findRequiredViewAsType(source, R.id.loadAnim, "field 'loadAnim'", LottieAnimationView.class);
    target.imgVitBack = Utils.findRequiredViewAsType(source, R.id.imgVitBack, "field 'imgVitBack'", ImageView.class);
    target.swipeContainer = Utils.findRequiredViewAsType(source, R.id.swipeContainer, "field 'swipeContainer'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.searchView = null;
    target.viewPager = null;
    target.vPagerVitrin = null;
    target.vPagerNew = null;
    target.indicator = null;
    target.recycNew = null;
    target.recycCat = null;
    target.recycCol = null;
    target.linNewItems = null;
    target.linEditorVit = null;
    target.linCol = null;
    target.linLoad = null;
    target.linVitNew = null;
    target.loadAnim = null;
    target.imgVitBack = null;
    target.swipeContainer = null;
  }
}
