package com.example.newsbreeze.ui.home

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsbreeze.adapter.NewsAdapter
import com.example.newsbreeze.database.ArticleDatabase
import com.example.newsbreeze.databinding.FragmentHomeBinding
import com.example.newsbreeze.repository.NewsRepository

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val newsRepository = NewsRepository(ArticleDatabase(requireActivity()))

        val viewModelFactory = HomeViewModelFactory(newsRepository)
        val viewModel = ViewModelProvider(this,viewModelFactory).get(HomeViewModel::class.java)

        newsAdapter = NewsAdapter()
        binding.rvBreakingNews.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }

        viewModel.getNews("in")

        viewModel.response?.observe(viewLifecycleOwner, Observer {
            Log.d("final result", it.body()?.articles.toString())
            newsAdapter.differ.submitList(it.body()?.articles)
        })

        viewModel.searchResponse?.observe(viewLifecycleOwner, Observer {
            Log.d("final result search", it.body()?.articles.toString())
            newsAdapter.differ.submitList(it.body()?.articles)
        })

        binding.etSearch.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                viewModel.getSearchedNews(p0.toString())
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}