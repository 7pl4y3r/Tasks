package com.apps.a7pl4y3r.tasks.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.apps.a7pl4y3r.tasks.objects.ThursdayTask

@Dao
interface ThursdayDao {

    @Insert
    fun insert(thursdayTask: ThursdayTask)

    @Update
    fun update(thursdayTask: ThursdayTask)

    @Delete
    fun delete(thursdayTask: ThursdayTask)

    @Query("SELECT * FROM ThursdayTask")
    fun getTasks(): LiveData<List<ThursdayTask>>

}