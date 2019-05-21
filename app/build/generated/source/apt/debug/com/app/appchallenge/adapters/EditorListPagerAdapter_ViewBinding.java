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
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EditorListPagerAdapter_ViewBinding implements Unbinder {
  private EditorListPagerAdapter target;

  @UiThread
  public EditorListPagerAdapter_ViewBinding(EditorListPagerAdapter target, View source) {
    this.target = target;

    target.imgCircle = Utils.findRequiredViewAsType(source, R.id.imgELogo, "field 'imgCircle'", CircleImageView.class);
    target.imageView1 = Utils.findRequiredViewAsType(source, R.id.imgOne, "field 'imageView1'", ImageView.class);
    target.imageView2 = Utils.findRequiredViewAsType(source, R.id.imgTwo, "field 'imageView2'", ImageView.class);
    target.imageView3 = Utils.findRequiredViewAsType(source, R.id.imgThree, "field 'imageView3'", ImageView.class);
    target.txEMain = Utils.findRequiredViewAsType(source, R.id.txEMain, "field 'txEMain'", TextView.class);
    target.txEsub = Utils.findRequiredViewAsType(source, R.id.txESub, "field 'txEsub'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EditorListPagerAdapter target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgCircle = null;
    target.imageView1 = null;
    target.imageView2 = null;
    target.imageView3 = null;
    target.txEMain = null;
    target.txEsub = null;
  }
}
