package com.wonder.dailydiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wonder.dailydiary.databinding.ActivityDiaryWriteBinding

class DiaryWriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary_write)

        val binding: ActivityDiaryWriteBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_diary_write)


    }
}
