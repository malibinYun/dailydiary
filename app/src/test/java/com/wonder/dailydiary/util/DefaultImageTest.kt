package com.wonder.dailydiary.util

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

}