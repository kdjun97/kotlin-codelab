package com.example.kotlin_codelab.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlin_codelab.R

class FirstFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Fragment LifeCycle", "First Fragment onCreate!")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment LifeCycle", "First Fragment onCreateView!")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment LifeCycle", "First Fragment onViewCreated!")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment LifeCycle", "First Fragment onStart!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment LifeCycle", "First Fragment onResume!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment LifeCycle", "First Fragment onPause!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment LifeCycle", "First Fragment onStop!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment LifeCycle", "First Fragment onDestroy!")
    }
}