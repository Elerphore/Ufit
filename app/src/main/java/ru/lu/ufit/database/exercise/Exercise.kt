package ru.lu.ufit.database.exercise

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise")
data class Exercise(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "exercise_name") val exerciseName: String,
    @ColumnInfo(name = "exercise_description") val exerciseDescription: String,
    @ColumnInfo(name = "exercise_time") val exerciseTime: Int,
//    @ColumnInfo(name = "exercise_image") val exerciseImage: Int,
)
