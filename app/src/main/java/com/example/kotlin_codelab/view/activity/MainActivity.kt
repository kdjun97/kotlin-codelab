package com.example.kotlin_codelab.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.kotlin_codelab.R
import com.example.kotlin_codelab.viewmodel.MyViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

// 여기서 선언한 것 중에 DI를 해야하는 것이 있음.
// 여기서 hilt를 쓸거임 라는 선언
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var myViewModel : MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Activity LifeCycle", "onCreate!")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.main_fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        bottom_navigation.setupWithNavController(navController) // nav graph setup

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
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