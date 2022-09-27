package com.example.newsbreeze.ui.detailed;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.newsbreeze.model.Article;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailedNewsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailedNewsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailedNewsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailedNewsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailedNewsFragmentArgs __result = new DetailedNewsFragmentArgs();
    bundle.setClassLoader(DetailedNewsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("article")) {
      Article article;
      if (Parcelable.class.isAssignableFrom(Article.class) || Serializable.class.isAssignableFrom(Article.class)) {
        article = (Article) bundle.get("article");
      } else {
        throw new UnsupportedOperationException(Article.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("article", article);
    } else {
      throw new IllegalArgumentException("Required argument \"article\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailedNewsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailedNewsFragmentArgs __result = new DetailedNewsFragmentArgs();
    if (savedStateHandle.contains("article")) {
      Article article;
      article = savedStateHandle.get("article");
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("article", article);
    } else {
      throw new IllegalArgumentException("Required argument \"article\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Article getArticle() {
    return (Article) arguments.get("article");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("article")) {
      Article article = (Article) arguments.get("article");
      if (Parcelable.class.isAssignableFrom(Article.class) || article == null) {
        __result.putParcelable("article", Parcelable.class.cast(article));
      } else if (Serializable.class.isAssignableFrom(Article.class)) {
        __result.putSerializable("article", Serializable.class.cast(article));
      } else {
        throw new UnsupportedOperationException(Article.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("article")) {
      Article article = (Article) arguments.get("article");
      if (Parcelable.class.isAssignableFrom(Article.class) || article == null) {
        __result.set("article", Parcelable.class.cast(article));
      } else if (Serializable.class.isAssignableFrom(Article.class)) {
        __result.set("article", Serializable.class.cast(article));
      } else {
        throw new UnsupportedOperationException(Article.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailedNewsFragmentArgs that = (DetailedNewsFragmentArgs) object;
    if (arguments.containsKey("article") != that.arguments.containsKey("article")) {
      return false;
    }
    if (getArticle() != null ? !getArticle().equals(that.getArticle()) : that.getArticle() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getArticle() != null ? getArticle().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailedNewsFragmentArgs{"
        + "article=" + getArticle()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetailedNewsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Article article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
    }

    @NonNull
    public DetailedNewsFragmentArgs build() {
      DetailedNewsFragmentArgs result = new DetailedNewsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setArticle(@NonNull Article article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Article getArticle() {
      return (Article) arguments.get("article");
    }
  }
}
