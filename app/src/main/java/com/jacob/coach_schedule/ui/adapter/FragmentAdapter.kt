package com.jacob.coach_schedule.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class FragmentAdapter(private val titles: Array<String>, fm: FragmentManager, private val list: List<Fragment> = emptyList()) : FragmentStatePagerAdapter(fm) {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

}