package com.zdl.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

    }

    private fun initView() {
        tv.setOnClickListener {
            val test: String = "123456"
            tv.text = test
        }

        btn.setOnClickListener {
            val btn2: String = "Button"//定义一个String变量
            tv.text = btn2//赋值
            Toast.makeText(this, btn2, Toast.LENGTH_SHORT).show()


        }
    }
}
