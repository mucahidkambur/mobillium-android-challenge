// Generated code from Butter Knife. Do not modify!
package com.app.appchallenge.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.app.appchallenge.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CollectionsAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private CollectionsAdapter.MyViewHolder target;

  @UiThread
  public CollectionsAdapter$MyViewHolder_ViewBinding(CollectionsAdapter.MyViewHolder target,
      View source) {
    this.target = target;

    target.txColMain = Utils.findRequiredViewAsType(source, R.id.txColMain, "field 'txColMain'", TextView.class);
    target.txColSub = Utils.findRequiredViewAsType(source, R.id.txColSub, "field 'txColSub'", TextView.class);
    target.imgCol = Utils.findRequiredViewAsType(source, R.id.imgCol, "field 'imgCol'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CollectionsAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txColMain = null;
    target.txColSub = null;
    target.imgCol = null;
  }
}
