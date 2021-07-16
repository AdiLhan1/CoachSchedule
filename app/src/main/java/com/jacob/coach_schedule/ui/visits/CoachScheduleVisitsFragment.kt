package com.jacob.coach_schedule.ui.visits

import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.jacob.coach_schedule.base.BaseEmptyFragment
import com.jacob.coach_schedule.databinding.FragmentVisitsHistoryBinding
import com.jacob.coach_schedule.ui.adapter.VisitsAdapter
import com.jacob.coach_schedule.utils.gone
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CoachScheduleVisitsFragment :
    BaseEmptyFragment<FragmentVisitsHistoryBinding>(FragmentVisitsHistoryBinding::inflate) {
    private val visitsViewModel: CoachScheduleVisitsViewModel by activityViewModels()

    override fun setUpView() {
        visitsViewModel.getVisitsHistory()
        initAdapter()
    }

    private fun initAdapter() {
        visitsViewModel.responseVisits.observe(requireActivity()) { it2 ->
            binding.apply {
                progressBar.gone()
                visitsRv.apply {
                    adapter = VisitsAdapter().also {
                        it.setDataInList(it2.visitsHistory)
                    }
                    layoutManager = LinearLayoutManager(requireContext())
                    addItemDecoration(
                        DividerItemDecoration(
                            requireContext(),
                            LinearLayoutManager.HORIZONTAL
                        )
                    )
                }
            }
        }
    }
}