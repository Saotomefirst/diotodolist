package com.saotome.diotodolist.model

import java.sql.Time
import java.util.*

data class Task(
    val id : Int = 0,
    val title : String,
    val description : String,
    val date : String,
    val hour : String
)
