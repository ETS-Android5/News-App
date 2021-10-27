package com.tolanylannie.newsapp.database

import androidx.room.TypeConverter
import com.tolanylannie.newsapp.model.Source


class Convertors {
    @TypeConverter
    fun fromSource(source: Source):String{
        return source.name
    }

    @TypeConverter
    fun toSource(name:String):Source{
        return Source(name,name)
    }
}