package com.example.quizappkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    private var currentIndex=0
    private var arrayList= ArrayList<Question>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addData()
        questiontv.text= arrayList[0].question



        btntrue.setOnClickListener(this)
        btnfalse.setOnClickListener(this)
        nextbtn.setOnClickListener(this)
        previousbtn.setOnClickListener(this)


    }



    private fun addData() {

        addDataInArrayList("Rajasthan is The Hottest state in India.",true)
        addDataInArrayList("Agra is Capital of India.",false)
        addDataInArrayList(" Fardeen Khan is Amitabh Bacchan's Son.",false)
        addDataInArrayList("Virat is the Best Cricket player.",true)
        addDataInArrayList("Shahrukh khan acted in Krish.",false)
        addDataInArrayList("Corona Virus Started from China",true)
        addDataInArrayList("My favourite dish is Bhindi.",false)
    }



    private fun addDataInArrayList(message: String, answer: Boolean) {

        val ques=Question(message,answer)
        arrayList.add(ques)
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.btntrue->{
                checkAnswer(true)
            }
            R.id.btnfalse->{
                checkAnswer(false)
            }
            R.id.nextbtn->{
                if (currentIndex<arrayList.size-1) {
                    currentIndex++
                    changeQuestion()
                }else{
                    toast("This is Last Question Thank You for Playing this Game")
                }
            }
            R.id.previousbtn->{
                if (currentIndex==0) {
                    toast("Can't go Back this is First Question")
                }else{
                    currentIndex--
                    changeQuestion()
                }
            }
        }

    }

    private fun changeQuestion() {
        questiontv.text=arrayList[currentIndex].question
    }

    private fun checkAnswer(userchoice:Boolean) {
        if (arrayList[currentIndex].answer==userchoice){
            toast("Your Answer Is Correct ")
        }else{
            toast("Wrong Answer")
        }
    }

}
