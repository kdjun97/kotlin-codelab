package com.example.kotlin_codelab.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.kotlin_codelab.R
import com.example.kotlin_codelab.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {
    var toastMsg : String = ""
    private lateinit var binding: FragmentFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Fragment LifeCycle", "Fourth Fragment onCreate!")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment LifeCycle", "Fourth Fragment onCreateView!")

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_fourth, container, false)
        binding.fragment = this@FourthFragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment LifeCycle", "Fourth Fragment onViewCreated!")

        toastMsg = ""
        val args: FourthFragmentArgs by navArgs()
        toastMsg += args.paging.toString()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment LifeCycle", "Fourth Fragment onStart!")
        toastMsg += "에서 4번으로 페이지 이동 완료!"
        Toast.makeText(context, toastMsg, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment LifeCycle", "Fourth Fragment onResume!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment LifeCycle", "Fourth Fragment onPause!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment LifeCycle", "Fourth Fragment onStop!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment LifeCycle", "Fourth Fragment onDestroy!")
    }

    // hidden button binding
    fun btnHidden(view : View) {
        var args = FourthFragmentDirections.actionFourthFragmentToFirstFragment(4)
        findNavController().navigate(args)
    }
}