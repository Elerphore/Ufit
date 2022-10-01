package ru.lu.ufit.database.exercise

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise")
    fun getAll(): List<Exercise>

//    @Insert
//    fun insertAll(vararg users: ExerciseDocument)
//
//    @Delete
//    fun delete(user: ExerciseDocument)
}