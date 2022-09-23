package com.example.newsbreeze.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.newsbreeze.R
import com.example.newsbreeze.database.ArticleDatabase
import com.example.newsbreeze.model.Article
import com.example.newsbreeze.ui.home.HomeViewModel
import com.example.newsbreeze.ui.home.HomeViewModelFactory
import com.squareup.picasso.Picasso

//import com.squareup.picasso.Picasso

class NewsAdapter(viewModel: HomeViewModel? = null) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    var viewModel: HomeViewModel? = viewModel
    private val differCallback = object : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_article, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val article = differ.currentList[position]
        if (article.urlToImage != null) {
            Picasso.get().load(article.urlToImage).into(holder.ArticleImg)
        }
        if (article.title != null) {
            holder.ArticleTitle.text = article.title
        } else {
            holder.ArticleTitle.visibility = GONE
        }
        if (article.description != null) {
            holder.ArticleDescription.text = article.description
        } else {
            holder.ArticleDescription.visibility = GONE
        }
        holder.ArticleDate.text = article.publishedAt
        holder.ArticleSaveBtn.setOnClickListener {
            if (viewModel != null) {
                viewModel!!.saveNews(article)
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ArticleImg: ImageView = itemView.findViewById(R.id.article_img)
        val ArticleTitle: TextView = itemView.findViewById(R.id.article_title)
        val ArticleDescription: TextView = itemView.findViewById(R.id.article_description)
        val ArticleDate: TextView = itemView.findViewById(R.id.article_date)
        val ArticleSaveBtn: Button = itemView.findViewById(R.id.article_btn_save);
        val ArticleReadBtn: Button = itemView.findViewById(R.id.article_btn_read);
    }
}