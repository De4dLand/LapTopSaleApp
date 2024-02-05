// Generated by view binder compiler. Do not edit!
package com.example.salesapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.salesapplication.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddAddressBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button adAddressBtn;

  @NonNull
  public final EditText adAddressLane;

  @NonNull
  public final EditText adCity;

  @NonNull
  public final EditText adName;

  @NonNull
  public final EditText adPhoneNumber;

  @NonNull
  public final EditText adPostalCode;

  @NonNull
  public final Toolbar addAddressToolbar;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextInputLayout textInputLayout4;

  @NonNull
  public final TextInputLayout textInputLayout5;

  @NonNull
  public final TextInputLayout textInputLayout6;

  @NonNull
  public final TextInputLayout textInputLayout7;

  @NonNull
  public final TextView textView8;

  private ActivityAddAddressBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button adAddressBtn, @NonNull EditText adAddressLane, @NonNull EditText adCity,
      @NonNull EditText adName, @NonNull EditText adPhoneNumber, @NonNull EditText adPostalCode,
      @NonNull Toolbar addAddressToolbar, @NonNull TextInputLayout textInputLayout3,
      @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5,
      @NonNull TextInputLayout textInputLayout6, @NonNull TextInputLayout textInputLayout7,
      @NonNull TextView textView8) {
    this.rootView = rootView;
    this.adAddressBtn = adAddressBtn;
    this.adAddressLane = adAddressLane;
    this.adCity = adCity;
    this.adName = adName;
    this.adPhoneNumber = adPhoneNumber;
    this.adPostalCode = adPostalCode;
    this.addAddressToolbar = addAddressToolbar;
    this.textInputLayout3 = textInputLayout3;
    this.textInputLayout4 = textInputLayout4;
    this.textInputLayout5 = textInputLayout5;
    this.textInputLayout6 = textInputLayout6;
    this.textInputLayout7 = textInputLayout7;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_address, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddAddressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_address_btn;
      Button adAddressBtn = ViewBindings.findChildViewById(rootView, id);
      if (adAddressBtn == null) {
        break missingId;
      }

      id = R.id.ad_address_lane;
      EditText adAddressLane = ViewBindings.findChildViewById(rootView, id);
      if (adAddressLane == null) {
        break missingId;
      }

      id = R.id.ad_city;
      EditText adCity = ViewBindings.findChildViewById(rootView, id);
      if (adCity == null) {
        break missingId;
      }

      id = R.id.ad_name;
      EditText adName = ViewBindings.findChildViewById(rootView, id);
      if (adName == null) {
        break missingId;
      }

      id = R.id.ad_phone_number;
      EditText adPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (adPhoneNumber == null) {
        break missingId;
      }

      id = R.id.ad_postal_code;
      EditText adPostalCode = ViewBindings.findChildViewById(rootView, id);
      if (adPostalCode == null) {
        break missingId;
      }

      id = R.id.add_address_toolbar;
      Toolbar addAddressToolbar = ViewBindings.findChildViewById(rootView, id);
      if (addAddressToolbar == null) {
        break missingId;
      }

      id = R.id.textInputLayout3;
      TextInputLayout textInputLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout3 == null) {
        break missingId;
      }

      id = R.id.textInputLayout4;
      TextInputLayout textInputLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout4 == null) {
        break missingId;
      }

      id = R.id.textInputLayout5;
      TextInputLayout textInputLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout5 == null) {
        break missingId;
      }

      id = R.id.textInputLayout6;
      TextInputLayout textInputLayout6 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout6 == null) {
        break missingId;
      }

      id = R.id.textInputLayout7;
      TextInputLayout textInputLayout7 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityAddAddressBinding((ConstraintLayout) rootView, adAddressBtn, adAddressLane,
          adCity, adName, adPhoneNumber, adPostalCode, addAddressToolbar, textInputLayout3,
          textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
