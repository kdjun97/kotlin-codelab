package com.example.kotlin_codelab.viewmodel

import android.util.Log
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

    // mission3 숫자를 불러오는 함수
    fun fetchData3() : LiveData<Int> {
        return missionRepository.Mission3
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

    fun mission3_one() : String {
        return missionRepository.mission3_one()
    }

    suspend fun mission3_two() : String {
        return missionRepository.mission3_two()
    }

    suspend fun mission3_three() : String {
        return missionRepository.mission3_three()
    }

    fun mission3_four() : String {
        return missionRepository.mission3_four()
    }
}