package com.wonder.dailydiary.entity

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import java.util.*

/**
 * Created By Yun Hyeok
 * on 9월 05, 2019
 */

class DiaryTest {

    lateinit var diaryNoImages: Diary

    @Before
    fun initDiary() {
        val date = Date(1567615864357) //1567615864357 = 2019-09-05 01:51
        diaryNoImages = Diary("나의 첫번째 다이어리", "호롤로로롤", 0, date, null)
    }

    @Test
    fun `필드에서 바로 파라미터값 사용이 되는지 여부`() {

        //given
        val diary = diaryNoImages

        //when
        val day = diary.day

        //then
        assertEquals(day, "2019.09.05")
    }

}