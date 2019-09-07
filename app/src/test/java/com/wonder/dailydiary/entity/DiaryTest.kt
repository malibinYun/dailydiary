package com.wonder.dailydiary.entity

import android.graphics.Bitmap
import com.wonder.dailydiary.R
import com.wonder.dailydiary.util.DefaultImage
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created By Yun Hyeok
 * on 9월 05, 2019
 */

class DiaryTest {

    lateinit var diaryNoImages: Diary
    lateinit var diaryWithDefaultImage: Diary
    lateinit var diaryHasImage: Diary

    lateinit var fakeBitmap: Bitmap

    @Before
    fun initDiary() {
        // 303 -> rainy3
        // 1567615864357 = 2019-09-05 01:51
        diaryNoImages = Diary(
            0, "나의 첫번째 다이어리", "호롤로로롤", Diary.WEATHER_RAIN,
            1567615864357, null, null
        )

        diaryWithDefaultImage = Diary(
            0, "나의 첫번째 다이어리", "호롤로로롤", Diary.WEATHER_RAIN,
            1567615864357, null, 303
        )
//
//        fakeBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.RGB_565)
        diaryHasImage = Diary(
            0, "나의 첫번째 다이어리", "호롤로로롤", Diary.WEATHER_RAIN,
            1567615864357, listOf(), null
        )
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

    @Test
    fun `defaultImageId 로 리소스 아이디값을 잘 가져오는지 여부`() {
        val diary = diaryWithDefaultImage

        val defaultImageResource = R.drawable.default_cover_rainy03

        assertEquals(defaultImageResource, diary.defaultImageResource)
    }

    @Test
    fun `이미지 아무것도 없을 때 디폴트 랜덤 아이디 값 생성 되는지 여부`() {
        val diary = diaryNoImages

        val randomImageId = diary.defaultImageId
        println("randomImageId : $randomImageId")

        val isRightImageId =
            randomImageId == DefaultImage.RAINY1.id
                    || randomImageId == DefaultImage.RAINY2.id
                    || randomImageId == DefaultImage.RAINY3.id

        assertEquals(true, isRightImageId)
    }


    @Test
    fun `이미지 아무것도 없을 때 디폴트 랜덤 이미지 리소스가 생성 되는지 여부`() {
        val diary = diaryNoImages

        val randomImageResource = diary.defaultImageResource

        val isRightImageResource =
            randomImageResource == R.drawable.default_cover_rainy01
                    || randomImageResource == R.drawable.default_cover_rainy02
                    || randomImageResource == R.drawable.default_cover_rainy03

        assertEquals(true, isRightImageResource)
    }

    @Test
    fun `이미지 있을 때 디폴트 이미지 없어야함`(){
        val diary = diaryHasImage

        assertEquals(null, diary.defaultImageId)
        // 비트맵 모킹.... 어케한담..
    }

}