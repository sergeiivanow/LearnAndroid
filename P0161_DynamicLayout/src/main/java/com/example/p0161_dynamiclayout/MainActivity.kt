package com.example.p0161_dynamiclayout

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // создание LinearLayout
        // создание LinearLayout
        val linLayout = LinearLayout(this)
        // установим вертикальную ориентацию
        // установим вертикальную ориентацию
        linLayout.orientation = LinearLayout.VERTICAL
        // создаем LayoutParams
        // создаем LayoutParams
        val linLayoutParam =
            ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        // устанавливаем linLayout как корневой элемент экрана
        // устанавливаем linLayout как корневой элемент экрана
        val lpView = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)

        val tv = TextView(this)
        tv.text = "TextView"
        tv.layoutParams = lpView
        linLayout.addView(tv)

        val btn = Button(this)
        btn.setText("Button")
        linLayout.addView(btn, lpView)
        setContentView(linLayout, linLayoutParam)

        val leftMarginParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
           LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
        )
        leftMarginParams.leftMargin = 50

        val btn1 = Button(this)
        btn1.text = "Button1"
        linLayout.addView(btn1, leftMarginParams)

        val rightGravityParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
        )
        rightGravityParams.gravity = Gravity.RIGHT

        val btn2 = Button(this)
        btn2.text = "Button2"
        linLayout.addView(btn2, rightGravityParams)
    }
}