package com.wonder.dailydiary.util

import androidx.annotation.DrawableRes
import com.wonder.dailydiary.R

/**
 * Created By Yun Hyeok
 * on 9월 06, 2019
 */

enum class DefaultImage(val id: Int, @DrawableRes val resource: Int) {
    SUNNY1(101, R.drawable.default_cover_sunny01),
    SUNNY2(102, R.drawable.default_cover_sunny02),
    SUNNY3(103, R.drawable.default_cover_sunny03),

    CLOUDY1(201, R.drawable.default_cover_cloudy01),
    CLOUDY2(202, R.drawable.default_cover_cloudy02),
    CLOUDY3(203, R.drawable.default_cover_cloudy03),

    RAINY1(301, R.drawable.default_cover_rainy01),
    RAINY2(302, R.drawable.default_cover_rainy02),
    RAINY3(303, R.drawable.default_cover_rainy03),

    SNOWY1(401, R.drawable.default_cover_snowy01),
    SNOWY2(402, R.drawable.default_cover_snowy02),
    SNOWY3(403, R.drawable.default_cover_snowy03);

    companion object {
        fun findById(id: Int): DefaultImage {
            return values().first { it.id == id }
        }
    }

}

