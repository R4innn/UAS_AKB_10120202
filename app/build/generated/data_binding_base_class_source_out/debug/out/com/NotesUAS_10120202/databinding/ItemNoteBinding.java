// Generated by view binder compiler. Do not edit!
package com.NotesUAS_10120202.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.NotesUAS_10120202.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemNoteBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView categoryNote;

  @NonNull
  public final TextView dateNote;

  @NonNull
  public final TextView titleNote;

  private ItemNoteBinding(@NonNull RelativeLayout rootView, @NonNull TextView categoryNote,
      @NonNull TextView dateNote, @NonNull TextView titleNote) {
    this.rootView = rootView;
    this.categoryNote = categoryNote;
    this.dateNote = dateNote;
    this.titleNote = titleNote;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_note;
      TextView categoryNote = ViewBindings.findChildViewById(rootView, id);
      if (categoryNote == null) {
        break missingId;
      }

      id = R.id.date_note;
      TextView dateNote = ViewBindings.findChildViewById(rootView, id);
      if (dateNote == null) {
        break missingId;
      }

      id = R.id.title_note;
      TextView titleNote = ViewBindings.findChildViewById(rootView, id);
      if (titleNote == null) {
        break missingId;
      }

      return new ItemNoteBinding((RelativeLayout) rootView, categoryNote, dateNote, titleNote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
