package com.lubitelsoft.shrekcast.ui.onboarding.viewPagerAdapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lubitelsoft.shrekcast.R
import com.lubitelsoft.shrekcast.databinding.FragmentEnterBinding
import com.lubitelsoft.shrekcast.databinding.FragmentOnBoardingBinding
import com.lubitelsoft.shrekcast.databinding.FragmentOnBoardingPageBinding


class OnBoardingPageFragment(val sting: String) : Fragment() {
    private lateinit var viewBinding: FragmentOnBoardingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentOnBoardingPageBinding.inflate(inflater, container, false)
        val view = viewBinding.root
        viewBinding.pageTV.text = sting
        return view
    }


}