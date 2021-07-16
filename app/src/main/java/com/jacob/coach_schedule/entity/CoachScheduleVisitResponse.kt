package com.jacob.coach_schedule.entity

import com.google.gson.annotations.SerializedName

data class CoachScheduleVisitResponse(
    @SerializedName("visits_history")
    val visitsHistory: MutableList<CoachScheduleVisitsItem>
)