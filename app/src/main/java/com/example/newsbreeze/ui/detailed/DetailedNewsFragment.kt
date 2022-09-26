package com.example.newsbreeze.ui.detailed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.newsbreeze.database.ArticleDatabase
import com.example.newsbreeze.databinding.FragmentDetailedNewsBinding
import com.example.newsbreeze.repository.NewsRepository
import com.squareup.picasso.Picasso


class DetailedNewsFragment : Fragment() {

    private var _binding: FragmentDetailedNewsBinding? = null

    private val binding get() = _binding!!

    private lateinit var viewModel: DetailedNewsViewModel

    private val args by navArgs<DetailedNewsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailedNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val newsRepository = NewsRepository(ArticleDatabase(requireActivity()))

        val viewModelFactory = DetailedNewsViewModelFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelFactory)[DetailedNewsViewModel::class.java]

        viewModel.setDetailedArticle(args.article)

        binding.date.text = viewModel.articleDate
        binding.title.text = viewModel.articleTitle
        binding.content.text = viewModel.articleContent
        binding.authorName.text = viewModel.articleAuthor

        Picasso.get().load(viewModel.articleImgUrl).into(binding.bgImg)

        binding.saveBtn.setOnClickListener {
            viewModel.saveNews(args.article)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}