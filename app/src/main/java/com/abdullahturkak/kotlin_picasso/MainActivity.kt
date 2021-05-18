package com.abdullahturkak.kotlin_picasso



import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"





        Picasso.get().load("https://i.pinimg.com/originals/77/77/cd/7777cd98e82985286c6acbb68f731bd5.jpg").into(imageView)
        Picasso.get().load("https://i.pinimg.com/originals/77/77/cd/7777cd98e82985286c6acbb68f731bd5.jpg").into(imageView2)
        Picasso.get().load("https://i.pinimg.com/originals/77/77/cd/7777cd98e82985286c6acbb68f731bd5.jpg").into(imageView3)
        Picasso.get()
            .load("https://i.pinimg.com/originals/77/77/cd/7777cd98e82985286c6acbb68f731bd5.jpg")
            .resize(250, 250)
            .centerCrop()
            .into(imageView)
    }
}