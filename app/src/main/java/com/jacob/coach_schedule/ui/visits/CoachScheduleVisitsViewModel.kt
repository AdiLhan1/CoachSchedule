package com.jacob.coach_schedule.ui.visits

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jacob.coach_schedule.base.BaseViewModel
import com.jacob.coach_schedule.entity.CoachScheduleVisitResponse
import com.jacob.coach_schedule.repository.CoachScheduleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoachScheduleVisitsViewModel @Inject constructor(
    private val repository: CoachScheduleRepository
) : BaseViewModel() {
    private val _response = MutableLiveData<CoachScheduleVisitResponse>()
    val responseVisits: LiveData<CoachScheduleVisitResponse>
        get() = _response

    fun getVisitsHistory() {
        uiScope.launch {
            repository.getVisitHistory().let {
                if (it.isSuccessful) {
                    _response.postValue(it.body())
                } else {
                    Log.e("TAG", "getVisits: Error ${it.code()}")
                }
            }
        }
    }
}