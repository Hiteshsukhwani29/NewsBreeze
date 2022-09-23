package com.example.newsbreeze.ui.saved

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsbreeze.adapter.NewsAdapter
import com.example.newsbreeze.database.ArticleDatabase
import com.example.newsbreeze.databinding.FragmentHomeBinding
import com.example.newsbreeze.databinding.FragmentSavedBinding
import com.example.newsbreeze.repository.NewsRepository
import com.example.newsbreeze.ui.saved.SavedViewModel
import com.example.newsbreeze.ui.saved.SavedViewModelFactory

class SavedFragment : Fragment() {

    private var _binding: FragmentSavedBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSavedBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val newsRepository = NewsRepository(ArticleDatabase(requireActivity()))

        val viewModelFactory = SavedViewModelFactory(newsRepository)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(SavedViewModel::class.java)

        newsAdapter = NewsAdapter()
        binding.rvBreakingNews.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }

        viewModel.getSavedNews()

        viewModel.response?.observe(viewLifecycleOwner, Observer {
            Log.d("final result", it.toString())
            newsAdapter.differ.submitList(it)
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}