package com.rhmd.myappr

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lbl_nama.text = "Rahmad Ardianto"
        var pengikut_count = 69
        lbl_pengikut_count.text = pengikut_count.toString()
        btn_follow.setOnClickListener {
            pengikut_count++
            lbl_pengikut_count.text = pengikut_count.toString()
        }

    }
}