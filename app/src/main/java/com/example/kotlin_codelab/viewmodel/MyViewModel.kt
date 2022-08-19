package com.example.kotlin_codelab.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin_codelab.repository.MissionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(val missionRepository: MissionRepository) : ViewModel() {
    fun fetchData() : LiveData<Int> {
        return missionRepository.Mission1
    }

    fun addMission1() {
        missionRepository.addMission1()
    }
}