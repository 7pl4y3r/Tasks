package com.apps.a7pl4y3r.tasks.repositories

import android.app.Application
import com.apps.a7pl4y3r.tasks.TaskDatabase
import com.apps.a7pl4y3r.tasks.mondayDb

class MondayRepo(application: Application) {

    private val db = TaskDatabase.getInstance(application, mondayDb)
    private val dao = db.mondayDao()

}