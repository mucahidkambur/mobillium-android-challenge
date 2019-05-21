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

public class NewVitrinAdapter_ViewBinding implements Unbinder {
  private NewVitrinAdapter target;

  @UiThread
  public NewVitrinAdapter_ViewBinding(NewVitrinAdapter target, View source) {
    this.target = target;

    target.imgVit = Utils.findRequiredViewAsType(source, R.id.imgVit, "field 'imgVit'", ImageView.class);
    target.imgVitLog = Utils.findRequiredViewAsType(source, R.id.imgVitLog, "field 'imgVitLog'", CircleImageView.class);
    target.txNewVitMain = Utils.findRequiredViewAsType(source, R.id.txNewVitMain, "field 'txNewVitMain'", TextView.class);
    target.txNewVitSub = Utils.findRequiredViewAsType(source, R.id.txNewVitSub, "field 'txNewVitSub'", TextView.class);
    target.txNewVitEsya = Utils.findRequiredViewAsType(source, R.id.txNewVitEsya, "field 'txNewVitEsya'", TextView.class);
    target.txNoLogo = Utils.findRequiredViewAsType(source, R.id.txNoLogo, "field 'txNoLogo'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewVitrinAdapter target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgVit = null;
    target.imgVitLog = null;
    target.txNewVitMain = null;
    target.txNewVitSub = null;
    target.txNewVitEsya = null;
    target.txNoLogo = null;
  }
}
