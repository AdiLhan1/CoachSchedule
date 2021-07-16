package com.jacob.coach_schedule.repository

import com.jacob.coach_schedule.backend.CoachScheduleService
import javax.inject.Inject

class CoachScheduleRepository
@Inject constructor(private val coachScheduleService: CoachScheduleService) {
    suspend fun getLessonHistory() = coachScheduleService.getLessonHistory()
    suspend fun getVisitHistory() = coachScheduleService.getVisitHistory()
}