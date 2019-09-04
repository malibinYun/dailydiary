package com.wonder.dailydiary.entity

import android.util.Log
import org.junit.Assert.*
import org.junit.Test
import java.util.*

/**
 * Created By Yun Hyeok
 * on 9월 05, 2019
 */

class DiaryTest {

    @Test
    fun 필드에서_바로_파라미터값_사용이_되는지_여부() {

        //given
        val date = Date(1567615864357) //1567615864357 = 2019-09-05 01:51
        val diary = Diary("", "", 0, date, null)

        //when
        val day = diary.day

        //then
        assertEquals(day,"2019.09.05")
    }

}