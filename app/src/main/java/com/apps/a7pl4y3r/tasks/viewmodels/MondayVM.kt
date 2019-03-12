package com.apps.a7pl4y3r.tasks.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.apps.a7pl4y3r.tasks.objects.MondayTask
import com.apps.a7pl4y3r.tasks.repositories.MondayRepo

class MondayVM(application: Application) : AndroidViewModel(application) {

    private val repo: MondayRepo = MondayRepo(application)
    private val tasks: LiveData<List<MondayTask>> = repo.getTasks()

    fun insert(task: MondayTask) {
        repo.insert(task)
    }

    fun update(task: MondayTask) {
        repo.update(task)
    }

    fun delete(task: MondayTask) {
        repo.delete(task)
    }

    fun getTasks(): LiveData<List<MondayTask>> = tasks

}