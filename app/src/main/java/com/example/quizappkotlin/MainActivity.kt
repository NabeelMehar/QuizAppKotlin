package com.example.quizappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var arrayList:ArrayList<Question>;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addData();








    }



    private fun addData() {

        addDataInArrayList("Rajasthan is The Hottest state in India.",true);
        addDataInArrayList("Agra is Capital of India.",false);
        addDataInArrayList(" Fardeen Khan is Amitabh Bacchan's Son.",false);
        addDataInArrayList("Virat is the Best Cricket player.",true);
        addDataInArrayList("Shahrukh khan acted in Krish.",false);
        addDataInArrayList("Corona Virus Started from China",true);
        addDataInArrayList("My favourite dish is Bhindi.",false)    }



    private fun addDataInArrayList(message: String, answer: Boolean) {

        var ques=Question(message,answer)
        arrayList.add(ques)
    }

}
