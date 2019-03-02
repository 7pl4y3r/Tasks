package com.apps.a7pl4y3r.tasks.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.apps.a7pl4y3r.tasks.objects.WednesdayTask

@Dao
interface WednesdayDao {

    @Insert
    fun insert(wednesdayTask: WednesdayTask)

    @Update
    fun update(wednesdayTask: WednesdayTask)

    @Delete
    fun delete(wednesdayTask: WednesdayTask)

    @Query("SELECT * FROM WednesdayTask")
    fun getTasks(): LiveData<List<WednesdayTask>>

}