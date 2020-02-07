package com.wonder.dailydiary.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wonder.dailydiary.R
import com.wonder.dailydiary.databinding.ActivityWriteDiaryBinding

class WriteDiaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityWriteDiaryBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_write_diary)


    }
}
