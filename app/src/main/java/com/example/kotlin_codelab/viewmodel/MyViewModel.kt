package com.example.kotlin_codelab.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin_codelab.model.data.CommunityModel
import com.example.kotlin_codelab.repository.MissionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(val missionRepository: MissionRepository) : ViewModel() {
    // mission1 숫자 증감에 대한 값을 불러오는 함수
    fun fetchData() : LiveData<Int> {
        return missionRepository.Mission1
    }

    // mission2 커뮤니티를 불러오는 함수
    fun fetchData2() : LiveData<MutableList<CommunityModel>> {
        return missionRepository.Mission2
    }

    fun addMission1() {
        missionRepository.addMission1()
    }

    fun addMission2() {
        missionRepository.addMission2()
    }

    fun deleteMission2(target: CommunityModel) {
        missionRepository.deleteMission2(target)
    }
}