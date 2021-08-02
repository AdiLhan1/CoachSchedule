package com.jacob.coach_schedule.ui.home

import com.jacob.coach_schedule.R
import com.jacob.coach_schedule.base.BaseEmptyFragment
import com.jacob.coach_schedule.databinding.FragmentCoachScheduleBinding
import com.jacob.coach_schedule.ui.adapter.FragmentAdapter
import com.jacob.coach_schedule.ui.lessons.CoachScheduleLessonsFragment
import com.jacob.coach_schedule.ui.visits.CoachScheduleVisitsFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CoachScheduleFragment :
    BaseEmptyFragment<FragmentCoachScheduleBinding>(FragmentCoachScheduleBinding::inflate) {

    override fun setUpView() {
        val viewPager = binding.viewPager
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(viewPager)
    }

    private val adapter by lazy {
        FragmentAdapter(
            arrayOf(getString(R.string.train), getString(R.string.visit)),
            requireActivity().supportFragmentManager,
            arrayListOf(
                CoachScheduleLessonsFragment(),
                CoachScheduleVisitsFragment()
            )
        )
    }
}