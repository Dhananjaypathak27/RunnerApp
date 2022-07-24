package com.inxparticle.runnerapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.inxparticle.runnerapp.db.Converters
import com.inxparticle.runnerapp.db.Run
import com.inxparticle.runnerapp.db.RunDAO

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO
}