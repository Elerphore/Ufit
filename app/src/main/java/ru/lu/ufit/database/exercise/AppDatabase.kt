package ru.lu.ufit.database.exercise

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Exercise::class], exportSchema = false, version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getExerciseDao(): ExerciseDao
}