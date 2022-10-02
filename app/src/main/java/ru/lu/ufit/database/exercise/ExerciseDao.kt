package ru.lu.ufit.database.exercise

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise")
    fun getAll(): Flow<List<Exercise>>
//
//    @Insert
//    fun insert(exercise: Exercise)
//
//    @Insert
//    fun insertAll(vararg exercises: Exercise)
//
//    @Delete
//    fun delete(user: Exercise)
}