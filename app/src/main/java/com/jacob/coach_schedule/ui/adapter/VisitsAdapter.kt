package com.jacob.coach_schedule.ui.adapter

import android.annotation.SuppressLint
import com.jacob.coach_schedule.R
import com.jacob.coach_schedule.base.BaseAdapter2
import com.jacob.coach_schedule.databinding.VisitsItemBinding
import com.jacob.coach_schedule.entity.CoachScheduleVisitsItem

class VisitsAdapter : BaseAdapter2<CoachScheduleVisitsItem, VisitsItemBinding>(
    R.layout.visits_item, mutableListOf(),
    inflater = VisitsItemBinding::inflate
) {
    @SuppressLint("SetTextI18n")
    override fun onBind(binding: VisitsItemBinding, model: CoachScheduleVisitsItem) {
        binding.run {
            title.text = model.name
            date.text = model.date
        }
    }
}