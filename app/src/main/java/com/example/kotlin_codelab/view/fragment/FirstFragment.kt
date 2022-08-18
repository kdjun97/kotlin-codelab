package com.example.kotlin_codelab.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.kotlin_codelab.R
import com.example.kotlin_codelab.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    var toastMsg : String = ""
    private lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Fragment LifeCycle", "First Fragment onCreate!")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment LifeCycle", "First Fragment onCreateView!")

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first, container, false)
        binding.fragment = this@FirstFragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment LifeCycle", "First Fragment onViewCreated!")

        toastMsg = ""
        try {
            val args: FourthFragmentArgs by navArgs()
            toastMsg += args.paging.toString()
        } catch (e: Exception) {
            toastMsg = "0" // 처음엔 safe args로 받을 값이 없음
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment LifeCycle", "First Fragment onStart!")
        toastMsg += "에서 1번으로 페이지 이동 완료!"
        Toast.makeText(context, toastMsg, Toast.LENGTH_SHORT).show()
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

    // safe args test button
    fun btnSafeArgsTest(view : View) {
        var args = FirstFragmentDirections.actionFirstFragmentToFourthFragment(1)
        findNavController().navigate(args)
        //findNavController().navigate(R.id.action_firstFragment_to_fourthFragment)
    }
}