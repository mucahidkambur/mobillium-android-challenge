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

public class EditorVitrinActivity_ViewBinding implements Unbinder {
  private EditorVitrinActivity target;

  @UiThread
  public EditorVitrinActivity_ViewBinding(EditorVitrinActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EditorVitrinActivity_ViewBinding(EditorVitrinActivity target, View source) {
    this.target = target;

    target.tbEditVit = Utils.findRequiredViewAsType(source, R.id.tbEditVit, "field 'tbEditVit'", Toolbar.class);
    target.recycEditVit = Utils.findRequiredViewAsType(source, R.id.recycEditVit, "field 'recycEditVit'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EditorVitrinActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tbEditVit = null;
    target.recycEditVit = null;
  }
}
