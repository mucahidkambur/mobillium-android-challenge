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

public class CollectionsActivity_ViewBinding implements Unbinder {
  private CollectionsActivity target;

  @UiThread
  public CollectionsActivity_ViewBinding(CollectionsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CollectionsActivity_ViewBinding(CollectionsActivity target, View source) {
    this.target = target;

    target.tbCl = Utils.findRequiredViewAsType(source, R.id.tbCl, "field 'tbCl'", Toolbar.class);
    target.recycCollections = Utils.findRequiredViewAsType(source, R.id.recycCollections, "field 'recycCollections'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CollectionsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tbCl = null;
    target.recycCollections = null;
  }
}
