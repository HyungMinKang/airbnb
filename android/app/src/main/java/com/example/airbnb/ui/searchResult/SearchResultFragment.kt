package com.example.airbnb.ui.searchResult

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.airbnb.R
import com.example.airbnb.databinding.FragmentSearchResultBinding
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class SearchResultFragment : Fragment() {

    private val viewModel: SearchResultViewModel by sharedViewModel()
    private lateinit var binding: FragmentSearchResultBinding
    private lateinit var navigator: NavController
    private var page = 1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search_result, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigator = Navigation.findNavController(view)
        val adapter = SearchResultAdapter({ openDetail() }) {
            addWish()
        }
        firstPageUpdate()
        binding.iBtnSearchResultSearchCondition.setOnClickListener {
            navigator.navigate(R.id.action_searchResultFragment_to_searchConditionFragment)
        }
        binding.condtion= viewModel.searchCondition.value

        binding.btnMapView.setOnClickListener {
            navigator.navigate(R.id.action_searchResultFragment_to_mapSearchActivity)
        }

        viewModel.searchResult.observe(viewLifecycleOwner) {
            adapter.submitList(it)
            adapter.notifyDataSetChanged()
            //viewModel.updatePage(page)
        }
        viewModel.pageAccommodations.observe(viewLifecycleOwner) {
            adapter.submitList(it)
            adapter.notifyItemRangeChanged((page - 1) * 10, 10)
        }

        binding.rvSearchResult.adapter = adapter
        binding.rvSearchResult.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (!recyclerView.canScrollVertically(1)) {
                    adapter.deleteLoading()
                    viewModel.updatePage(page++)
                }
            }
        })
    }

    private fun firstPageUpdate() {
        //모든 조건 존재
        if (viewModel.validateSearchCondition()) {
            viewModel.getSearchResultByAllCondition()
        }
        //아닐때
        else {
            viewModel.getSearchResultByTag()
        }
    }

    private fun openDetail() {
        //navigate to detail
        navigator.navigate(R.id.action_searchResultFragment_to_accommodationActivity)
    }

    private fun addWish() {
        //To Do: Add Item Wish Page
    }
}