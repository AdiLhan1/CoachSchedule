package com.jacob.coach_schedule.entity

import com.google.gson.annotations.SerializedName

data class CoachScheduleVisitsItem(
    @SerializedName("date")
    val date: String = "",
    @SerializedName("name")
    val name: String = ""
)