package com.lubitelsoft.shrekcast.ui.onboarding

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.lubitelsoft.shrekcast.R
import com.lubitelsoft.shrekcast.databinding.FragmentOnBoardingBinding
import com.lubitelsoft.shrekcast.ui.onboarding.viewPagerAdapter.ViewPagerAdapter

class OnBoardingFragment : Fragment() {

    private lateinit var viewBinding: FragmentOnBoardingBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val stringLst = listOf(
            "Добро пожаловать в ShrekCast - самое зеленое приложение для прогноза погоды!",
            "Мы рады приветствовать вас в нашем огромном луковом королевстве, где вы сможете получить самую точную информацию о погоде в любом месте и в любое время.",
            "ShrekCast - это не просто еще одно приложение для прогноза погоды."
        )

        viewBinding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        val view = viewBinding.root

        viewPagerAdapter = ViewPagerAdapter(stringLst, requireActivity())

        viewBinding.onboardingViewPager.adapter = viewPagerAdapter

        TabLayoutMediator(viewBinding.tabLayout,viewBinding.onboardingViewPager){tab, position ->

        }.attach()


        viewBinding.btnContinue.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardingFragment_to_enterFragment)
        }
        return view
    }

}