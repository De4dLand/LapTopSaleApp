// Generated by view binder compiler. Do not edit!
package com.example.salesapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.salesapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CategoryListBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView catImg;

  @NonNull
  public final TextView catName;

  private CategoryListBinding(@NonNull CardView rootView, @NonNull ImageView catImg,
      @NonNull TextView catName) {
    this.rootView = rootView;
    this.catImg = catImg;
    this.catName = catName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CategoryListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CategoryListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.category_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CategoryListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cat_img;
      ImageView catImg = ViewBindings.findChildViewById(rootView, id);
      if (catImg == null) {
        break missingId;
      }

      id = R.id.cat_name;
      TextView catName = ViewBindings.findChildViewById(rootView, id);
      if (catName == null) {
        break missingId;
      }

      return new CategoryListBinding((CardView) rootView, catImg, catName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
