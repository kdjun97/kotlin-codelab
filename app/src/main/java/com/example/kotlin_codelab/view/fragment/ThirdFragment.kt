package com.example.kotlin_codelab.view.fragment

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.example.kotlin_codelab.R
import com.example.kotlin_codelab.databinding.FragmentThirdBinding
import com.example.kotlin_codelab.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.fragment_third.*
import kotlinx.coroutines.*

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    var job4: Job? = null
    private val myViewModel : MyViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Fragment LifeCycle", "Third Fragment onCreate!")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment LifeCycle", "Third Fragment onCreateView!")

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_third, container, false)
        binding.fragment = this@ThirdFragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment LifeCycle", "Third Fragment onViewCreated!")

        var text : String=""

        CoroutineScope(Dispatchers.Main).launch {
            // for job1
            CoroutineScope(Dispatchers.Default).launch {
                for (i in 1..10) {
                    text += myViewModel.mission3_one()
                }
            }.join()
            txt_mission3.text = text

            text+=" end job1\n"

            // for job2
            text+=myViewModel.mission3_two()
            text+=" end job2\n"
            txt_mission3.text=text

            // for job3
            text+=myViewModel.mission3_three()
            text+=" end job3\n"
            txt_mission3.text=text

            // for job4
            job4 = CoroutineScope(Dispatchers.Main).launch {
                while (true) {
                    text += myViewModel.mission3_four()
                    delay(1000)
                    txt_mission3.text=text
                }
            }
            job4!!.join()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment LifeCycle", "Third Fragment onStart!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment LifeCycle", "Third Fragment onResume!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment LifeCycle", "Third Fragment onPause!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment LifeCycle", "Third Fragment onStop!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment LifeCycle", "Third Fragment onDestroy!")
    }

    // job4 cancel button
    fun btnCoroutineCancel(view : View) {
        if (job4 != null) {
            job4!!.cancel()
            txt_mission3.text = "취소 버튼을 누르셨습니다!"
            txt_mission3.setTextColor(Color.parseColor("#FF0000"))
        }
    }
}