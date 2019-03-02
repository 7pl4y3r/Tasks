package com.apps.a7pl4y3r.tasks.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.apps.a7pl4y3r.tasks.objects.FridayTask

@Dao
interface FridayDao {

    @Insert
    fun insert(fridayTask: FridayTask)

    @Update
    fun update(fridayTask: FridayTask)

    @Delete
    fun delete(fridayTask: FridayTask)

    @Query("SELECT * FROM FridayTask")
    fun getTasks(): LiveData<List<FridayTask>>

}