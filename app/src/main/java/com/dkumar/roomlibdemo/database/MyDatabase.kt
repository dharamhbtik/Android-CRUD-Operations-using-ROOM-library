package com.dkumar.roomlibdemo.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Employee::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun myDao(): MyDao
}