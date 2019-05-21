// Generated code from Butter Knife. Do not modify!
package com.app.appchallenge.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.app.appchallenge.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CategoriesAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private CategoriesAdapter.MyViewHolder target;

  @UiThread
  public CategoriesAdapter$MyViewHolder_ViewBinding(CategoriesAdapter.MyViewHolder target,
      View source) {
    this.target = target;

    target.txCat = Utils.findRequiredViewAsType(source, R.id.txCat, "field 'txCat'", TextView.class);
    target.imgCat = Utils.findRequiredViewAsType(source, R.id.imgCat, "field 'imgCat'", ImageView.class);
    target.layCategories = Utils.findRequiredViewAsType(source, R.id.layCategories, "field 'layCategories'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CategoriesAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txCat = null;
    target.imgCat = null;
    target.layCategories = null;
  }
}
