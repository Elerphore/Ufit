package ru.lu.ufit.database.exercise

import androidx.annotation.WorkerThread
import javax.inject.Inject

@Suppress("RedundantSuspendModifier")
@WorkerThread
class ExerciseRepositoryImpl @Inject constructor(private val exerciseDao: ExerciseDao) {
    fun getAll() = exerciseDao.getAll()
}