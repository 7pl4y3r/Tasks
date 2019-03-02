package com.apps.a7pl4y3r.tasks

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.apps.a7pl4y3r.tasks.daos.*
import com.apps.a7pl4y3r.tasks.dayfragments.Monday
import com.apps.a7pl4y3r.tasks.dayfragments.Tuesday
import com.apps.a7pl4y3r.tasks.objects.FridayTask
import com.apps.a7pl4y3r.tasks.objects.ThursdayTask
import com.apps.a7pl4y3r.tasks.objects.WednesdayTask

@Database(
    entities = [Monday::class, Tuesday::class, WednesdayTask::class, ThursdayTask::class, FridayTask::class],
    version = 1
)
abstract class TaskDatabase : RoomDatabase() {

    abstract fun mondayDao(): MondayDao
    abstract fun tuesdayDao(): TuesdayDao
    abstract fun wednesdayDao(): WednesdayDao
    abstract fun thursdayDao(): ThursdayDao
    abstract fun fridayDao(): FridayDao

    companion object {

        private var instance: TaskDatabase? = null

        fun getInstance(context: Context, name: String): TaskDatabase {

            if (instance == null) {
                synchronized(TaskDatabase::class) {
                    instance = Room.databaseBuilder(
                        context.applicationContext, TaskDatabase::class.java, name
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }

            return instance!!
        }

    }

}