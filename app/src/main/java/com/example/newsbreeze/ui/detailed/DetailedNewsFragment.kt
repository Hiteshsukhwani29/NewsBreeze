package com.example.newsbreeze.ui.detailed

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
import com.example.newsbreeze.databinding.FragmentDetailedNewsBinding
import com.example.newsbreeze.databinding.FragmentHomeBinding
import com.example.newsbreeze.repository.NewsRepository
import com.example.newsbreeze.ui.detailed.DetailedNewsViewModelFactory


class DetailedNewsFragment : Fragment() {

    private var _binding: FragmentDetailedNewsBinding? = null

    private val binding get() = _binding!!

    private lateinit var viewModel: DetailedNewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailedNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val newsRepository = NewsRepository(ArticleDatabase(requireActivity()))

        val viewModelFactory = DetailedNewsViewModelFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(DetailedNewsViewModel::class.java)



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}