package com.jacob.coach_schedule.ui.adapter

import android.annotation.SuppressLint
import com.jacob.coach_schedule.R
import com.jacob.coach_schedule.base.BaseAdapter2
import com.jacob.coach_schedule.databinding.LessonsItemBinding
import com.jacob.coach_schedule.entity.CoachScheduleLessonItem
import com.jacob.coach_schedule.utils.getType

class LessonAdapter : BaseAdapter2<CoachScheduleLessonItem, LessonsItemBinding>(
    R.layout.lessons_item, mutableListOf(),
    inflater = LessonsItemBinding::inflate
) {
    @SuppressLint("SetTextI18n")
    override fun onBind(binding: LessonsItemBinding, model: CoachScheduleLessonItem) {
        binding.run {
            icon.setImageResource(model.getType())
            title.text = model.name
            trainerName.text = model.trainerName
            price.text = "${model.price} Р"
        }
    }
}