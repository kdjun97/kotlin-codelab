package com.example.kotlin_codelab.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_codelab.R
import com.example.kotlin_codelab.databinding.FragmentSecondBinding
import com.example.kotlin_codelab.view.adapter.CommunityAdapter
import com.example.kotlin_codelab.viewmodel.MyViewModel

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var adapter : CommunityAdapter
    private val myViewModel : MyViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Fragment LifeCycle", "Second Fragment onCreate!")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment LifeCycle", "Second Fragment onCreateView!")

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)
        binding.fragment = this@SecondFragment

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment LifeCycle", "Second Fragment onViewCreated!")

        adapter = CommunityAdapter(myViewModel)
        binding.communityRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.communityRecyclerView.adapter = adapter

        // Divider for recyclerview
        binding.communityRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            )
        )

        observeData()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment LifeCycle", "Second Fragment onStart!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment LifeCycle", "Second Fragment onResume!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment LifeCycle", "Second Fragment onPause!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment LifeCycle", "Second Fragment onStop!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment LifeCycle", "Second Fragment onDestroy!")
    }

    // 커뮤니티 observe
    fun observeData() {
        myViewModel.fetchData2().observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            adapter.submitList(it.map{
                it.copy()
            })
        })
    }

    // 커뮤니티 사람 증가 버튼
    fun btnAddCommunity(view : View) {
        myViewModel.addMission2()
    }
}