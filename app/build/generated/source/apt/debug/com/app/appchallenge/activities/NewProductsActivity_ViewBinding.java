// Generated code from Butter Knife. Do not modify!
package com.app.appchallenge.activities;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.app.appchallenge.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewProductsActivity_ViewBinding implements Unbinder {
  private NewProductsActivity target;

  @UiThread
  public NewProductsActivity_ViewBinding(NewProductsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewProductsActivity_ViewBinding(NewProductsActivity target, View source) {
    this.target = target;

    target.tbNewProducts = Utils.findRequiredViewAsType(source, R.id.tbNewProducts, "field 'tbNewProducts'", Toolbar.class);
    target.recycNewProducts = Utils.findRequiredViewAsType(source, R.id.recycNewProducts, "field 'recycNewProducts'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewProductsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tbNewProducts = null;
    target.recycNewProducts = null;
  }
}
