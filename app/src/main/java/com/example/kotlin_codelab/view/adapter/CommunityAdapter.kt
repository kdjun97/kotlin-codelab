package com.example.kotlin_codelab.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.kotlin_codelab.databinding.CommunityListUiBinding
import com.example.kotlin_codelab.model.data.CommunityModel
import com.example.kotlin_codelab.view.adapter.viewholder.CommunityViewHolder
import com.example.kotlin_codelab.viewmodel.MyViewModel

class CommunityAdapter (private val myViewModel : MyViewModel) : ListAdapter<CommunityModel, CommunityViewHolder>(diffUtil) {
    lateinit var binding : CommunityListUiBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : CommunityViewHolder {
        binding = CommunityListUiBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CommunityViewHolder(binding, myViewModel)
    }

    override fun onBindViewHolder(holder: CommunityViewHolder, position: Int) {
        holder.onBind(currentList[position])
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<CommunityModel>() {
            override fun areItemsTheSame(oldItem: CommunityModel, newItem: CommunityModel): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: CommunityModel, newItem: CommunityModel): Boolean =
                oldItem == newItem
        }
    }
}