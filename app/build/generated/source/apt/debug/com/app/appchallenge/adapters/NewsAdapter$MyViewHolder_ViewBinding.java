// Generated code from Butter Knife. Do not modify!
package com.app.appchallenge.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.app.appchallenge.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewsAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private NewsAdapter.MyViewHolder target;

  @UiThread
  public NewsAdapter$MyViewHolder_ViewBinding(NewsAdapter.MyViewHolder target, View source) {
    this.target = target;

    target.txNewMain = Utils.findRequiredViewAsType(source, R.id.txNewMain, "field 'txNewMain'", TextView.class);
    target.txNewSub = Utils.findRequiredViewAsType(source, R.id.txNewSub, "field 'txNewSub'", TextView.class);
    target.txNewMon = Utils.findRequiredViewAsType(source, R.id.txNewMon, "field 'txNewMon'", TextView.class);
    target.txNewOld = Utils.findRequiredViewAsType(source, R.id.txNewOld, "field 'txNewOld'", TextView.class);
    target.imgPic = Utils.findRequiredViewAsType(source, R.id.imgNewPic, "field 'imgPic'", ImageView.class);
    target.layNewSliderMain = Utils.findRequiredViewAsType(source, R.id.layNewSliderMain, "field 'layNewSliderMain'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewsAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txNewMain = null;
    target.txNewSub = null;
    target.txNewMon = null;
    target.txNewOld = null;
    target.imgPic = null;
    target.layNewSliderMain = null;
  }
}
