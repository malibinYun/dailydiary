package com.wonder.dailydiary.util

import com.wonder.dailydiary.R
import com.wonder.dailydiary.entity.Diary
import org.junit.Assert.*
import org.junit.Test

/**
 * Created By Yun Hyeok
 * on 9월 07, 2019
 */
class DefaultImageTest {

    @Test
    fun `아이디 가지고 제대로 찾는지 확인`() {
        // given
        val defaultImage = DefaultImage.RAINY2

        // when
        val testImage = DefaultImage.findById(302) // Rainy2 의 실제 아이디 정수 값

        // then
        assertEquals(defaultImage, testImage)
    }

    @Test
    fun `계절 상수에 따른 랜덤 디폴트 이미지 아이디 나오는지 확인`() {
        //랜덤은 믿고 가는게 낫다고 한다. 테스트 하는 것 보다.

        val randomImageResource = DefaultImage.getRandomOf(Diary.WEATHER_SNOW)

        val isRight =
            randomImageResource == Diary.WEATHER_SNOW + 1
                    || randomImageResource == Diary.WEATHER_SNOW + 2
                    || randomImageResource == Diary.WEATHER_SNOW + 3

        assertEquals(true, isRight)
    }

}