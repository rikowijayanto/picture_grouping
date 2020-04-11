package com.example.myviewandview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    //penambahan package implementation 'de.hdodenhof:circleimageview:3.0.0' di build.gradle
    // penggunaan layout scroll view agar aplikasi bisa di scroll
    // penggunaan table row untuk menampilkan spesifikasi


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Google Pixel"
        }
    }
}
