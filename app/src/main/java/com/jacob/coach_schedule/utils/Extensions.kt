package com.jacob.coach_schedule.utils

import android.view.View
import com.jacob.coach_schedule.R
import com.jacob.coach_schedule.entity.CoachScheduleLessonItem

fun CoachScheduleLessonItem.getType(): Int {
    return when (type) {
        "Personal" -> R.drawable.ic_user
        "Group" -> R.drawable.ic_group
        else -> R.drawable.ic_user
    }
}

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}