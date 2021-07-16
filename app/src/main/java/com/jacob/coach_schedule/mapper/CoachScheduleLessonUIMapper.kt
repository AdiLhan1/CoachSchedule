package com.jacob.coach_schedule.mapper

import com.jacob.coach_schedule.entity.CoachScheduleLessonItem
import com.jacob.coach_schedule.model.CoachScheduleLessonImpl
import com.jacob.coach_schedule.utils.CoachScheduleUIMapper

class CoachScheduleLessonUIMapper :
    CoachScheduleUIMapper<CoachScheduleLessonItem, CoachScheduleLessonImpl> {
    override fun mapFromEntity(entity: CoachScheduleLessonItem): CoachScheduleLessonImpl {
        return CoachScheduleLessonImpl(
            date = entity.date,
            price = entity.price,
            name = entity.name,
            trainerName = entity.trainerName,
            type = entity.type
        )
    }

    override fun mapToEntity(domainModel: CoachScheduleLessonImpl): CoachScheduleLessonItem {
        return CoachScheduleLessonItem(
            date = domainModel.date,
            price = domainModel.price,
            name = domainModel.name,
            trainerName = domainModel.trainerName,
            type = domainModel.type
        )
    }

    fun fromEntityList(initial: List<CoachScheduleLessonItem>): List<CoachScheduleLessonImpl> {
        return initial.map { mapFromEntity(it) }
    }

    fun toEntityList(initial: List<CoachScheduleLessonImpl>): List<CoachScheduleLessonItem> {
        return initial.map { mapToEntity(it) }
    }
}