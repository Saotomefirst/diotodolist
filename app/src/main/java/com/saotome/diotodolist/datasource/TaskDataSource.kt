package com.saotome.diotodolist.datasource

import com.saotome.diotodolist.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList () = list

    fun insertTask (task: Task) {
        list.add(task.copy(id = list.size + 1))
    }
}