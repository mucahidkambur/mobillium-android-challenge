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

public class NewVitrinsActivity_ViewBinding implements Unbinder {
  private NewVitrinsActivity target;

  @UiThread
  public NewVitrinsActivity_ViewBinding(NewVitrinsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewVitrinsActivity_ViewBinding(NewVitrinsActivity target, View source) {
    this.target = target;

    target.tbNewVit = Utils.findRequiredViewAsType(source, R.id.tbNewVit, "field 'tbNewVit'", Toolbar.class);
    target.recycNewVit = Utils.findRequiredViewAsType(source, R.id.recycNewVit, "field 'recycNewVit'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewVitrinsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tbNewVit = null;
    target.recycNewVit = null;
  }
}
