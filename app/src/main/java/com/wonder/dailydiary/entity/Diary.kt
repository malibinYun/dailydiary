package com.wonder.dailydiary.entity

import android.graphics.Bitmap
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created By Yun Hyeok
 * on 9월 05, 2019
 */

data class Diary(
    val title: String,
    val content: String,
    val state: Int,
    val date: Date,
    val images: List<Bitmap>?
) {
    val day = SimpleDateFormat("yyyy.MM.dd", Locale.KOREA).format(date)
    val time = SimpleDateFormat("hh시 mm분", Locale.KOREA).format(date)

    init {

    }

    companion object {
        const val WEATHER_SUNNY = 0
        const val WEATHER_CLOUD = 1
        const val WEATHER_RAIN = 2
        const val WEATHER_SNOW = 3
    }
}