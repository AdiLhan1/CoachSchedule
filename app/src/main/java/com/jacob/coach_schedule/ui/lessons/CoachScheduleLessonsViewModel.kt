package com.jacob.coach_schedule.ui.lessons

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jacob.coach_schedule.base.BaseViewModel
import com.jacob.coach_schedule.entity.CoachScheduleResponse
import com.jacob.coach_schedule.repository.CoachScheduleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoachScheduleLessonsViewModel
@Inject constructor(private val repository: CoachScheduleRepository) : BaseViewModel() {

    private val _response = MutableLiveData<CoachScheduleResponse>()
    val responseLessons: LiveData<CoachScheduleResponse>
        get() = _response

    fun getLessonHistory() {
        uiScope.launch {
            repository.getLessonHistory().let {
                if (it.isSuccessful) {
                    _response.postValue(it.body())
                } else {
                    Log.e("TAG", "getLessonHistory: Error ${it.code()}")
                }
            }
        }
    }

}