package com.apps.a7pl4y3r.tasks.objects

import androidx.room.Entity

@Entity
class TuesdayTask(
    private var id: String,
    private var name: String,
    private var date: String) {

    fun setId(id: String) {
        this.id = id
    }

    fun getId(): String = id
    fun getName(): String = name
    fun getDate():String = date

}