package com.example.hesapmakinesi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    var firstNumber : Double? = null

    var operator : Char? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn0.setOnClickListener{
            if(txt.text.equals("0")){
                txt.text = "0"
            }else{
                txt.text = "${txt.text}" + "0"
            }
        }
        btn1.setOnClickListener{
            if( txt.text.equals("0")){
                txt.text = "1"
            }else{
                txt.text = "${txt.text}" + "1"
            }
        }
        btn2.setOnClickListener{
            if( txt.text.equals("0")){
                txt.text = "2"
            }else{
                txt.text = "${txt.text}" + "2"
            }
        }
        btn3.setOnClickListener{
            if(txt.text.equals("0")){
                txt.text = "3"
            }else{
                txt.text = "${txt.text}" + "3"
            }
        }
        btn4.setOnClickListener{
            if( txt.text.equals("0")){
                txt.text = "4"
            }else{
                txt.text = "${txt.text}" + "4"
            }
        }
        btn5.setOnClickListener{
            if(txt.text.equals("0")){
                txt.text = "5"
            }else{
                txt.text = "${txt.text}" + "5"
            }
        }
        btn6.setOnClickListener{
            if(txt.text.equals("0")){
                txt.text = "6"
            }else{
                txt.text = "${txt.text}" + "6"
            }
        }
        btn7.setOnClickListener{
            if(txt.text.equals("0")){
                txt.text = "7"
            }else{
                txt.text = "${txt.text}" + "7"
            }
        }
        btn8.setOnClickListener{
            if(txt.text.equals("0")){
                txt.text = "8"
            }else{
                txt.text = "${txt.text}" + "8"
            }
        }
        btn9.setOnClickListener{
            if(txt.text.equals("0")){
                txt.text = "9"
            }else{
                txt.text = "${txt.text}" + "9"
            }
        }
        btnAdd.setOnClickListener {
           if(res.text.toString() == ""){
               operator = '+'
               firstNumber = txt.text.toString().toDouble()
               txt.text = ""

           }else{
               operator = '+'
               firstNumber = res.text.toString().toDouble()
               txt.text = ""
           }
       }
        btnEx.setOnClickListener {
            if(res.text.toString().equals("")){
                operator = '-'
                firstNumber = txt.text.toString().toDouble()
                txt.text = ""

            }else{
                operator = '-'
                firstNumber = res.text.toString().toDouble()
                txt.text = ""
            }
        }
        btnMul.setOnClickListener {
            if(res.text.toString().equals("")){
                operator = '*'
                firstNumber = txt.text.toString().toDouble()
                txt.text = ""

            }else{
                operator = '*'
                firstNumber = res.text.toString().toDouble()
                txt.text = ""
            }
        }

        btnDiv.setOnClickListener {
            if(res.text.toString().equals("")){
                operator = '/'
                firstNumber = txt.text.toString().toDouble()
                txt.text = ""

            }else{
                operator = '/'
                firstNumber = res.text.toString().toDouble()
                txt.text = ""
            }
        }
        btnPer.setOnClickListener {
            if(res.text.toString().equals("")){
                operator = '%'
                firstNumber = txt.text.toString().toDouble()
                txt.text = ""

            }else{
                operator = '%'
                firstNumber = res.text.toString().toDouble()
                txt.text = ""
            }
        }
        btnDot.setOnClickListener {
            txt.text = "${txt.text}"+"."
        }
        btnBackSpace.setOnClickListener {
            txt.text = removeLastChar(txt.text.toString())
        }
        btnclr.setOnClickListener {
            txt.text = "0"
            res.text = ""
            firstNumber = 0.0

        }
        btnEq.setOnClickListener {

            if(operator!= '='){

                if(operator == '+'){
                    res.text = add(firstNumber!!,txt.text.toString().toDouble()).toString()
                    operator = '='
                }
                else if(operator == '-'){
                    res.text = ex(firstNumber!!,txt.text.toString().toDouble()).toString()
                    operator = '='
                }
                else if(operator == '/'){
                    res.text = div(firstNumber!!,txt.text.toString().toDouble()).toString()
                    operator = '='
                }
                else if(operator == '*'){
                    res.text = mul(firstNumber!!,txt.text.toString().toDouble()).toString()
                    operator = '='
                }
                else if(operator == '%'){
                    res.text = div(firstNumber!!,100.0).toString()
                }
            }else{
                txt.text = res.text.toString()
                res.text = ""
            }
        }


    }
    private fun  add(number1: Double, number2: Double): Double{
        return number1+number2
    }
    private fun ex(number1 :Double, number2: Double): Double{
        return number1-number2
    }
    private fun mul(number1 :Double, number2: Double): Double{
        return number1*number2
    }
    private fun div(number1 :Double, number2: Double): Double{
        return number1/number2
    }

    private fun remove(text : String,flag : Int) : String{
       return text.substring(0,text.length-flag)
    }

    private fun removeLastChar(text : String) :String{
        return remove(text,1)
    }




}