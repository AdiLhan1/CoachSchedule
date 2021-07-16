package com.jacob.coach_schedule

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jacob.coach_schedule.databinding.ActivityMainBinding
import com.jacob.coach_schedule.entity.CoachScheduleLessonItem
import com.jacob.coach_schedule.mapper.CoachScheduleLessonUIMapper
import com.jacob.coach_schedule.model.CoachScheduleLessonImpl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_newspaper, R.id.navigation_calendar, R.id.navigation_favorite
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        setMapper()
    }

    private fun setMapper() {
        val mapper = CoachScheduleLessonUIMapper()
        val lessonImpl = CoachScheduleLessonImpl()
        val lessonItem: CoachScheduleLessonItem = mapper.mapToEntity(lessonImpl)
        val r: CoachScheduleLessonImpl = mapper.mapFromEntity(lessonItem)
        Log.e("TAG", "setMapper: $r")
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}