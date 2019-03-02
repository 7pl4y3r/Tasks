package com.apps.a7pl4y3r.tasks.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.apps.a7pl4y3r.tasks.objects.TuesdayTask

@Dao
interface TuesdayDao {

    @Insert
    fun insert(tuesdayTask: TuesdayTask)

    @Update
    fun update(tuesdayTask: TuesdayTask)

    @Delete
    fun delete(tuesdayTask: TuesdayTask)

    @Query("SELECT * FROM TuesdayTask")
    fun getTasks(): LiveData<List<TuesdayTask>>

}