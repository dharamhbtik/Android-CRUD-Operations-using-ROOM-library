package com.dkumar.roomlibdemo.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "emp_table")
data class Employee(
    @PrimaryKey
    var id:Int,
    @ColumnInfo(name="emp_name")
    var name:String,
    var email:String)
