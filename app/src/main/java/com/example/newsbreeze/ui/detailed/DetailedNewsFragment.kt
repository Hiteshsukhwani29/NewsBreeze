package com.example.newsbreeze.ui.detailed

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsbreeze.R

class DetailedNewsFragment : Fragment() {

    companion object {
        fun newInstance() = DetailedNewsFragment()
    }

    private lateinit var viewModel: DetailedNewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detailed_news, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailedNewsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}