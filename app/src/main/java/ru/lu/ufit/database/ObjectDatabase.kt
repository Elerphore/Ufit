package ru.lu.ufit.database

import androidx.room.Room
import android.content.Context
import ru.lu.ufit.database.exercise.AppDatabase

object ObjectDatabase {
    @Volatile
    private var appDatabase : AppDatabase? = null

    fun init(context: Context) =
        when(val tempInstance = appDatabase) {
            null ->
                synchronized(this) {
                    appDatabase = Room.databaseBuilder((context.applicationContext),
                    AppDatabase::class.java,
                    "app_database").build()

                    appDatabase
                }
            else -> tempInstance
        }
}