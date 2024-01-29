package com.lubitelsoft.shrekcast.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lubitelsoft.shrekcast.R
import com.lubitelsoft.shrekcast.databinding.FragmentOnBoardingBinding

class OnBoardingFragment : Fragment() {

    private lateinit var viewBinding: FragmentOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        val view = viewBinding.root
        viewBinding.btnContinue.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardingFragment_to_enterFragment)
        }
        return view
    }

}