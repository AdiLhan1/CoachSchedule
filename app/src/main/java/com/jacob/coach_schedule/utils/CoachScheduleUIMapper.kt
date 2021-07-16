package com.jacob.coach_schedule.utils

interface CoachScheduleUIMapper<Entity, DomainModel> {
    fun mapFromEntity(entity: Entity): DomainModel

    fun mapToEntity(domainModel: DomainModel): Entity
}