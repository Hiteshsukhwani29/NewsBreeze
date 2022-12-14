package com.example.newsbreeze.ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.newsbreeze.R;
import com.example.newsbreeze.model.Article;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionNavHomeToDetailedNewsFragment actionNavHomeToDetailedNewsFragment(
      @NonNull Article article) {
    return new ActionNavHomeToDetailedNewsFragment(article);
  }

  @NonNull
  public static NavDirections actionNavHomeToSavedFragment() {
    return new ActionOnlyNavDirections(R.id.action_nav_home_to_savedFragment);
  }

  public static class ActionNavHomeToDetailedNewsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionNavHomeToDetailedNewsFragment(@NonNull Article article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavHomeToDetailedNewsFragment setArticle(@NonNull Article article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_nav_home_to_detailedNewsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Article getArticle() {
      return (Article) arguments.get("article");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavHomeToDetailedNewsFragment that = (ActionNavHomeToDetailedNewsFragment) object;
      if (arguments.containsKey("article") != that.arguments.containsKey("article")) {
        return false;
      }
      if (getArticle() != null ? !getArticle().equals(that.getArticle()) : that.getArticle() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getArticle() != null ? getArticle().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavHomeToDetailedNewsFragment(actionId=" + getActionId() + "){"
          + "article=" + getArticle()
          + "}";
    }
  }
}
