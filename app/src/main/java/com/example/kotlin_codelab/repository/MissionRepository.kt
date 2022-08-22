package com.example.kotlin_codelab.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlin_codelab.model.data.CommunityModel

class MissionRepository {
    var count = 0
    val _mission1 = MutableLiveData<Int>()
    val Mission1: LiveData<Int> get() = _mission1

    val _mission2 = MutableLiveData<MutableList<CommunityModel>>()
    val Mission2: LiveData<MutableList<CommunityModel>> get() = _mission2

    val _mission3 = MutableLiveData<Int>()
    val Mission3: LiveData<Int> get() = _mission3

    var communityList = ArrayList<CommunityModel>()

    init {
        _mission1.value = 1
    }

    // 숫자 1~10까지 증가 함수
    fun addMission1() {
        if (_mission1.value!! >= 10)
            _mission1.value=1
        else
            _mission1.value = _mission1.value!!.plus(1) // value = 뭐다 이런식으로 적어주어야함.
    }

    // 커뮤니티 유저 증가 함수
    fun addMission2() {
        communityList.add(CommunityModel(id = count, contents = count.toString(), name = "동준"))
        count++
        _mission2.value = communityList
    }

    // 커뮤니티 삭제 함수
    fun deleteMission2(target : CommunityModel) {
        var idx = communityList.indexOf(target)
        communityList.removeAt(idx)
        _mission2.value = communityList
    }

    fun mission3_one() : String {
        Log.d("1111", "1")
        return "1"
    }

    suspend fun mission3_two() : String {
        var text : String = ""
        for (i in 1..10) {
            Log.d("2222","2")
            text+="2"
        }
        return text
    }

    suspend fun mission3_three() : String {
        var text : String = ""
        for (i in 1..10) {
            Log.d("3333","3")
            text+="3"
        }
        return text
    }

    fun mission3_four() : String {
        Log.d("4444", "4")
        return "4"
    }
}