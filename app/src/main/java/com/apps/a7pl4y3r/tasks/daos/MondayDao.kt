package com.apps.a7pl4y3r.tasks.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.apps.a7pl4y3r.tasks.objects.MondayTask

@Dao
interface MondayDao {

    @Insert
    fun insert(mondayTask: MondayTask)

    @Update
    fun update(mondayTask: MondayTask)

    @Delete
    fun delete(mondayTask: MondayTask)

    @Query("SELECT * FROM MondayTask")
    fun getTasks(): LiveData<List<MondayTask>>

}