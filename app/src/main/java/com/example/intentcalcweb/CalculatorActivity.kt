package com.example.intentcalcweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        btn_sum.setOnClickListener {
            var firstnum = first_number.text.toString()
            var secondnum = second_number.text.toString()
            if (firstnum.isEmpty() or secondnum.isEmpty()) {
                txt_answer.text = "please fill in the details"
            } else {
                var answer = firstnum.toDouble() + secondnum.toDouble()
                txt_answer.text = answer.toString()

            }
        }
        btn_subtract.setOnClickListener {
            var firstnum = first_number.text.toString()
            var secondnum = second_number.text.toString()
            if (firstnum.isEmpty() or secondnum.isEmpty()) {
                txt_answer.text = "please fill in the details"
            } else {
                var answer = firstnum.toDouble() - secondnum.toDouble()
                txt_answer.text = answer.toString()

            }
        }
        btn_divide.setOnClickListener {
            var firstnum = first_number.text.toString()
            var secondnum = second_number.text.toString()
            if (firstnum.isEmpty() or secondnum.isEmpty()) {
                txt_answer.text = "please fill in the details"
            } else {
                var answer = firstnum.toDouble() / secondnum.toDouble()
                txt_answer.text = answer.toString()

            }
        }
        btn_multiply.setOnClickListener {
            var firstnum = first_number.text.toString()
            var secondnum = second_number.text.toString()
            if (firstnum.isEmpty() or secondnum.isEmpty()) {
                txt_answer.text = "please fill in the details"
            } else {
                var answer = firstnum.toDouble() * secondnum.toDouble()
                txt_answer.text = answer.toString()

            }
        }
    }
}
