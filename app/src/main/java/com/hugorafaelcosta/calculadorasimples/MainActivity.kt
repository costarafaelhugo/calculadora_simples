package com.hugorafaelcosta.calculadorasimples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hugorafaelcosta.calculadorasimples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        makeNumbers()

    }


    fun makeNumbers(){
        var result = binding.result
        var expression = binding.expression


        val numberZero = binding.btnNumber0.setOnClickListener {
            expression.append("0")
        }
        val numberOne = binding.btnNumberOne.setOnClickListener {
            expression.append("1")
        }
        val numberTwo = binding.btnNumberTwo.setOnClickListener {
            expression.append("2")
        }
        val numberThree = binding.btnNumberThree.setOnClickListener {
            expression.append("3")
        }
        val numberFour = binding.btnNumberFour.setOnClickListener {
            expression.append("4")
        }
        val numberFive = binding.btnNumberFive.setOnClickListener {
            expression.append("5")
        }
        val numberSix = binding.btnNumberSix.setOnClickListener {
            expression.append("6")
        }
        val numberSeven = binding.btnNumberSeven.setOnClickListener {
            expression.append("7")
        }
        val numberEight = binding.btnNumberEight.setOnClickListener {
            expression.append("8")
        }
        val numberNine = binding.btnNumberNine.setOnClickListener {
            expression.append("9")
        }

        val multiply = binding.btnMultiply.setOnClickListener {

            expression.append("*")
            result.text = expression.text.dropLast(1)
        }
        val division = binding.btnDivision.setOnClickListener {

            expression.append("/")
            result.text = expression.text.dropLast(1)
        }
        val minus = binding.btnMinus.setOnClickListener {

            expression.append("-")
            result.text = expression.text.dropLast(1)
        }
        val plus = binding.btnPlus.setOnClickListener {
            expression.append("+")
            result.text = expression.text.dropLast(1)
        }



        val clear = binding.btnClear.setOnClickListener {
            expression.text = ""
            result.text = "0"
        }

    }
}
