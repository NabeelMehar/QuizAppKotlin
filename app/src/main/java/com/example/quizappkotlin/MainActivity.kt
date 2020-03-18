package com.example.quizappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var arrayList:ArrayList<String>;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayList.add("What is The Hottest state in India");
        arrayList.add("What is Capital of India");
        arrayList.add("Who is Amitabh Bacchans Son?");
        arrayList.add("Who is the Best Cricket player");
        arrayList.add("What is Capital of India");
        arrayList.add("What is Capital of India");

    }
}
