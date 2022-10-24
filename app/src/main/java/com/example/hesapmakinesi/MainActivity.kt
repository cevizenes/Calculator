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
                txt.setText("0")
            }else{
                txt.setText("${txt.text}" + "0")
            }
        }
        btn1.setOnClickListener{
            if( txt.text.equals("0")){
                txt.setText("1")
            }else{
                txt.setText("${txt.text}" + "1")
            }
        }
        btn2.setOnClickListener{
            if( txt.text.equals("0")){
                txt.setText("2")
            }else{
                txt.setText("${txt.text}" + "2")
            }
        }
        btn3.setOnClickListener{
            if(txt.text.equals("0")){
                txt.setText("3")
            }else{
                txt.setText("${txt.text}" + "3")
            }
        }
        btn4.setOnClickListener{
            if( txt.text.equals("0")){
                txt.setText("4")
            }else{
                txt.setText("${txt.text}" + "4")
            }
        }
        btn5.setOnClickListener{
            if(txt.text.equals("0")){
                txt.setText("5")
            }else{
                txt.setText("${txt.text}" + "5")
            }
        }
        btn6.setOnClickListener{
            if(txt.text.equals("0")){
                txt.setText("6")
            }else{
                txt.setText("${txt.text}" + "6")
            }
        }
        btn7.setOnClickListener{
            if(txt.text.equals("0")){
                txt.setText("7")
            }else{
                txt.setText("${txt.text}" + "7")
            }
        }
        btn8.setOnClickListener{
            if(txt.text.equals("0")){
                txt.setText("8")
            }else{
                txt.setText("${txt.text}" + "8")
            }
        }
        btn9.setOnClickListener{
            if(txt.text.equals("0")){
                txt.setText("9")
            }else{
                txt.setText("${txt.text}" + "9")
            }
        }
        btnAdd.setOnClickListener {
           if(res.text.toString().equals("")){
               operator = '+'
               firstNumber = txt.text.toString().toDouble()
               txt.setText("")

           }else{
               operator = '+'
               firstNumber = res.text.toString().toDouble()
               txt.setText("")
           }
       }
        btnEx.setOnClickListener {
            if(res.text.toString().equals("")){
                operator = '-'
                firstNumber = txt.text.toString().toDouble()
                txt.setText("")

            }else{
                operator = '-'
                firstNumber = res.text.toString().toDouble()
                txt.setText("")
            }
        }
        btnMul.setOnClickListener {
            if(res.text.toString().equals("")){
                operator = '*'
                firstNumber = txt.text.toString().toDouble()
                txt.setText("")

            }else{
                operator = '*'
                firstNumber = res.text.toString().toDouble()
                txt.setText("")
            }
        }

        btnDiv.setOnClickListener {
            if(res.text.toString().equals("")){
                operator = '/'
                firstNumber = txt.text.toString().toDouble()
                txt.setText("")

            }else{
                operator = '/'
                firstNumber = res.text.toString().toDouble()
                txt.setText("")
            }
        }
        btnPer.setOnClickListener {
            if(res.text.toString().equals("")){
                operator = '%'
                firstNumber = txt.text.toString().toDouble()
                txt.setText("")

            }else{
                operator = '%'
                firstNumber = res.text.toString().toDouble()
                txt.setText("")
            }
        }
        btnDot.setOnClickListener {
            txt.setText("${txt.text}"+".")
        }
        btnBackSpace.setOnClickListener {
            txt.setText(removeLastChar(txt.text.toString()))
        }
        btnclr.setOnClickListener {
            txt.setText("0")
            res.setText("")
            firstNumber = 0.0

        }
        btnEq.setOnClickListener {

            if(operator!= '='){

                if(operator == '+'){
                   res.setText(add(firstNumber!!,txt.text.toString().toDouble()).toString())
                    operator = '='
                }
                else if(operator == '-'){
                    res.setText(ex(firstNumber!!,txt.text.toString().toDouble()).toString())
                    operator = '='
                }
                else if(operator == '/'){
                    res.setText(div(firstNumber!!,txt.text.toString().toDouble()).toString())
                    operator = '='
                }
                else if(operator == '*'){
                    res.setText(mul(firstNumber!!,txt.text.toString().toDouble()).toString())
                    operator = '='
                }
                else if(operator == '%'){
                    res.setText(div(firstNumber!!,100.0).toString())
                }
            }else{
                txt.setText(res.text.toString())
                res.setText("")
            }
        }


    }
    fun add(number1: Double, number2: Double): Double{
        return number1+number2
    }
    fun ex(number1 :Double, number2: Double): Double{
        return number1-number2
    }
    fun mul(number1 :Double, number2: Double): Double{
        return number1*number2
    }
    fun div(number1 :Double, number2: Double): Double{
        return number1/number2
    }

    fun remove(text : String,flag : Int) : String{
       return text.substring(0,text.length-flag)
    }

    fun removeLastChar(text : String) :String{
        return remove(text,1)
    }




}