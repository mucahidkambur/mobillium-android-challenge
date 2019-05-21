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

public class FeaturedAdapter_ViewBinding implements Unbinder {
  private FeaturedAdapter target;

  @UiThread
  public FeaturedAdapter_ViewBinding(FeaturedAdapter target, View source) {
    this.target = target;

    target.imgFeaBack = Utils.findRequiredViewAsType(source, R.id.imgFBack, "field 'imgFeaBack'", ImageView.class);
    target.txMain = Utils.findRequiredViewAsType(source, R.id.txFMain, "field 'txMain'", TextView.class);
    target.txSub = Utils.findRequiredViewAsType(source, R.id.txFSub, "field 'txSub'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FeaturedAdapter target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgFeaBack = null;
    target.txMain = null;
    target.txSub = null;
  }
}
