package com.example.kotlin_codelab.view.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_codelab.databinding.CommunityListUiBinding
import com.example.kotlin_codelab.model.data.CommunityModel
import com.example.kotlin_codelab.viewmodel.MyViewModel

class CommunityViewHolder (val binding: CommunityListUiBinding, val myViewModel: MyViewModel) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(data: CommunityModel) = with(binding) {
        binding.communityModel = data
        btnDeleteButton.setOnClickListener{
            myViewModel.deleteMission2(data) // model 값으로 커뮤니티 삭제
        }
    }
}