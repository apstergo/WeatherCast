package com.lubitelsoft.shrekcast.ui.onboarding.viewPagerAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(val stringList:List<String>, fragmentManager: FragmentActivity): FragmentStateAdapter(fragmentManager){
    override fun getItemCount(): Int = stringList.size

    override fun createFragment(position: Int): Fragment {
        return OnBoardingPageFragment(stringList[position])
    }
}