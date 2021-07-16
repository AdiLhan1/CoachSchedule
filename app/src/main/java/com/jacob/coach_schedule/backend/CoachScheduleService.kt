package com.jacob.coach_schedule.backend

import com.jacob.coach_schedule.entity.CoachScheduleResponse
import com.jacob.coach_schedule.entity.CoachScheduleVisitResponse
import com.jacob.coach_schedule.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface CoachScheduleService {
    @GET(Constants.END_POINT_LESSON)
    suspend fun getLessonHistory(): Response<CoachScheduleResponse>

    @GET(Constants.END_POINT_VISIT)
    suspend fun getVisitHistory(): Response<CoachScheduleVisitResponse>
}