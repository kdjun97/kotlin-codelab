package com.example.kotlin_codelab.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.kotlin_codelab.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Activity LifeCycle", "onCreate!")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.main_fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        bottom_navigation.setupWithNavController(navController) // nav graph setup

        // Navigate Override
        /*
        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.firstFragment -> {
                    Log.d("BottomNavBar", "First Fragment 클릭")
                    navController.navigate(R.id.firstFragment)
                    true
                }
                R.id.secondFragment -> {
                    Log.d("BottomNavBar", "Second Fragment 클릭")
                    navController.navigate(R.id.secondFragment)
                    true
                }
                R.id.thirdFragment -> {
                    Log.d("BottomNavBar", "Third Fragment 클릭")
                    navController.navigate(R.id.thirdFragment)
                    true
                }
                else -> {
                    Log.d("BottomNavBar", "Error")
                    false
                }
            }
        }
        */
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity LifeCycle", "onStart!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity LifeCycle", "onResume!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity LifeCycle", "onPause!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity LifeCycle", "onStop!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity LifeCycle", "onDestroy!")
    }
}