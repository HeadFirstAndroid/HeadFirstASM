package me.yifeiyuan.headfirstasm

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(40){

        }

    }

    fun helloWorld(view: View) {
        HelloWorld().greeting()
    }
}
