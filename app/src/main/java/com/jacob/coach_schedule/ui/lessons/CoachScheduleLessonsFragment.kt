package com.jacob.coach_schedule.ui.lessons

import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.jacob.coach_schedule.base.BaseEmptyFragment
import com.jacob.coach_schedule.databinding.FragmentLessonsHistoryBinding
import com.jacob.coach_schedule.ui.adapter.LessonAdapter
import com.jacob.coach_schedule.utils.gone
import com.jacob.coach_schedule.utils.visible
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CoachScheduleLessonsFragment :
    BaseEmptyFragment<FragmentLessonsHistoryBinding>(FragmentLessonsHistoryBinding::inflate) {
    private val coachScheduleLessonsViewModel: CoachScheduleLessonsViewModel by activityViewModels()

    override fun setUpView() {
        coachScheduleLessonsViewModel.getLessonHistory()
        initAdapter()
    }

    private fun initAdapter() {
        coachScheduleLessonsViewModel.responseLessons.observe(requireActivity()) { it2 ->
            binding.apply {
                progressBar.gone()
                date.visible()
                date.text = it2.lessonsHistory[0].date
                lessonsRv.apply {
                    adapter = LessonAdapter().also {
                        it.setDataInList(it2.lessonsHistory)
                    }
                    layoutManager = LinearLayoutManager(requireContext())
                }
            }
        }
    }
}