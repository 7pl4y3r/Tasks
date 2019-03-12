package com.apps.a7pl4y3r.tasks.repositories

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.apps.a7pl4y3r.tasks.daos.MondayDao
import com.apps.a7pl4y3r.tasks.databases.MondayDb
import com.apps.a7pl4y3r.tasks.objects.MondayTask

class MondayRepo(application: Application) {


    companion object {

        const val insertOperation = 1
        const val updateOperation = 2
        const val deleteOperation = 3

    }


    private val dao: MondayDao
    private val tasks: LiveData<List<MondayTask>>

    init {

        val db = MondayDb.getInstance(application)
        dao = db.mondayDao()
        tasks = dao.getTasks()

    }


    fun insert(mondayTask: MondayTask) {
        DatabaseOperation(dao, insertOperation).execute(mondayTask)
    }

    fun update(mondayTask: MondayTask) {
        DatabaseOperation(dao, updateOperation).execute(mondayTask)
    }

    fun delete(mondayTask: MondayTask) {
        DatabaseOperation(dao, deleteOperation).execute(mondayTask)
    }

    fun getTasks(): LiveData<List<MondayTask>> = tasks


    class DatabaseOperation(private val dao: MondayDao, private val operation: Int) : AsyncTask<MondayTask, Void, Void>() {

        override fun doInBackground(vararg params: MondayTask): Void? {

            when (operation) {

                MondayRepo.insertOperation -> dao.insert(params[0])
                MondayRepo.updateOperation -> dao.update(params[0])
                MondayRepo.deleteOperation -> dao.delete(params[0])

            }

            return null
        }
    }


}