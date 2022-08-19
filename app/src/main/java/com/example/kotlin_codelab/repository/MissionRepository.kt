package com.example.kotlin_codelab.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MissionRepository {
    val _mission1 = MutableLiveData<Int>()
    val Mission1: LiveData<Int> get() = _mission1

    init {
        _mission1.value = 1
    }

    fun addMission1() {
        if (_mission1.value!! >= 10)
            _mission1.value=1
        else
            _mission1.value = _mission1.value!!.plus(1) // value = 뭐다 이런식으로 적어주어야함.
    }
}