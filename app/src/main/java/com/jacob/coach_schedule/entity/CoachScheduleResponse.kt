package com.jacob.coach_schedule.entity

import com.google.gson.annotations.SerializedName

data class CoachScheduleResponse(
    @SerializedName("lessons_history")
    val lessonsHistory: MutableList<CoachScheduleLessonItem>
)