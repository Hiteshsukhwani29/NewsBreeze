package com.example.newsbreeze.ui.home

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsbreeze.adapter.NewsAdapter
import com.example.newsbreeze.database.ArticleDatabase
import com.example.newsbreeze.databinding.FragmentHomeBinding
import com.example.newsbreeze.repository.NewsRepository


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    private lateinit var newsAdapter: NewsAdapter

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val newsRepository = NewsRepository(ArticleDatabase(requireActivity()))

        val viewModelFactory = HomeViewModelFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)

        newsAdapter = NewsAdapter(viewModel)

        viewModel.response?.observe(viewLifecycleOwner, Observer {
            Log.d("final result", it.body()?.articles.toString())
            newsAdapter.differ.submitList(it.body()?.articles)
        })

        viewModel.searchResponse?.observe(viewLifecycleOwner, Observer {
            Log.d("final result search", it.body()?.articles.toString())
            newsAdapter.differ.submitList(it.body()?.articles)
        })

        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                viewModel.getSearchedNews(p0.toString())
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })

        binding.homeSavedBtn.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionNavHomeToSavedFragment())
        }

        return root
    }

    override fun onResume() {
        super.onResume()
        viewModel.getNews("in")
        binding.rvBreakingNews.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }

    override fun onStart() {
        super.onStart()
        viewModel.getNews("in")
        binding.rvBreakingNews.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}