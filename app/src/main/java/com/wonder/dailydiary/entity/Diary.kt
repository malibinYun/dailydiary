package com.wonder.dailydiary.entity

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created By Yun Hyeok
 * on 9월 05, 2019
 */

@Entity(tableName = "diary")
data class Diary(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "diary_id")
    val id: Long,

    @ColumnInfo(name = "diary_title")
    val title: String,

    @ColumnInfo(name = "diary_content")
    val content: String,

    @ColumnInfo(name = "diary_state")
    val state: Int,

    @ColumnInfo(name = "diary_date")
    val date: Long,

    @ColumnInfo(name = "diary_images")
    val images: List<Bitmap>?

) {
    @Ignore
    val day: String = SimpleDateFormat("yyyy.MM.dd", Locale.KOREA).format(Date(date))

    @Ignore
    val time: String = SimpleDateFormat("hh시 mm분", Locale.KOREA).format(Date(date))

    init {

    }

    companion object {
        const val WEATHER_SUNNY = 10
        const val WEATHER_CLOUD = 11
        const val WEATHER_RAIN = 12
        const val WEATHER_SNOW = 13
    }
}