package com.example.measure

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.ActivityUtils
import kotlinx.android.synthetic.main.activity_choose.*

class ChooseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        initView()
    }

    private fun initView() {
        UI_Main.setOnClickListener { ActivityUtils.startActivity(MainActivity::class.java) }
        UI_Cross.setOnClickListener { ActivityUtils.startActivity(CrossActivity::class.java) }
    }
}