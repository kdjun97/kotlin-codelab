package com.example.kotlin_codelab.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin_codelab.R

class SecondFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Fragment LifeCycle", "Second Fragment onCreate!")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment LifeCycle", "Second Fragment onCreateView!")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment LifeCycle", "Second Fragment onViewCreated!")
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
}