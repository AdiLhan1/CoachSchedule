package com.jacob.coach_schedule.entity

import com.google.gson.annotations.SerializedName

data class CoachScheduleLessonItem(
    @SerializedName("date")
    val date: String = "",
    @SerializedName("price")
    val price: Double = 0.0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("trainer_name")
    val trainerName: String = "",
    @SerializedName("type")
    val type: String = ""
)