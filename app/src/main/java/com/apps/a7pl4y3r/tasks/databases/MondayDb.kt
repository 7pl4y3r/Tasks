package com.apps.a7pl4y3r.tasks.databases

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.apps.a7pl4y3r.tasks.daos.MondayDao
import com.apps.a7pl4y3r.tasks.dayfragments.Monday
import com.apps.a7pl4y3r.tasks.mondayDb

@Database(entities = [Monday::class], version = 1)
abstract class MondayDb : RoomDatabase() {

    abstract fun mondayDao(): MondayDao

    companion object {

        private var instance: MondayDb? = null

        fun getInstance(context: Context): MondayDb {

            if (instance == null) {
                synchronized(MondayDb::class) {

                    instance = Room.databaseBuilder(context.applicationContext, MondayDb::class.java, mondayDb)
                        .fallbackToDestructiveMigration()
                        .build()

                }
            }

            return instance!!
        }

    }

}