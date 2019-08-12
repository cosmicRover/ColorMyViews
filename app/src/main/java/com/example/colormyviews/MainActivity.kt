package com.example.colormyviews

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RemoteViews
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var clickableViews: List<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         clickableViews = listOf(box_one_text, box_two_text, box_three_text,
            box_four_text, box_five_text, mainView, red_button, green_button, yellow_button)

        setListeners()

    }

    private fun setListeners(){

        for (item in clickableViews) {
            item.setOnClickListener { changeColore(it)}
        }
    }

    private fun changeColore(view: View){
        when (view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_two_text -> view.setBackgroundColor(Color.GREEN)

            R.id.box_three_text -> view.setBackgroundColor(Color.RED)
            R.id.box_four_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_five_text -> view.setBackgroundColor(Color.MAGENTA)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.button_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.button_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.button_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}




















