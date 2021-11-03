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

        var result = binding.result
        var expression = binding.expression

        val numberZero = binding.btnNumber0.setOnClickListener {

            addExpression("0", true)
        }
        val numberOne = binding.btnNumberOne.setOnClickListener {

            addExpression("1", true)
        }
        val numberTwo = binding.btnNumberTwo.setOnClickListener {

            addExpression("2", true)
        }
        val numberThree = binding.btnNumberThree.setOnClickListener {
            addExpression("3", true)
        }
        val numberFour = binding.btnNumberFour.setOnClickListener {
            addExpression("4", true)
        }
        val numberFive = binding.btnNumberFive.setOnClickListener {
            addExpression("5", true)
        }
        val numberSix = binding.btnNumberSix.setOnClickListener {
            addExpression("6", true)
        }
        val numberSeven = binding.btnNumberSeven.setOnClickListener {
            addExpression("7", true)
        }
        val numberEight = binding.btnNumberEight.setOnClickListener {
            addExpression("8", true)
        }
        val numberNine = binding.btnNumberNine.setOnClickListener {
            addExpression("9", true)
        }

        val multiply = binding.btnMultiply.setOnClickListener {

            addExpression("*", false)
        }
        val division = binding.btnDivision.setOnClickListener {

            addExpression("/", false)
        }
        val minus = binding.btnMinus.setOnClickListener {

            addExpression("-", false)
        }
        val plus = binding.btnPlus.setOnClickListener {
            addExpression("+", false)
        }

        val clear = binding.btnClear.setOnClickListener {
            expression.text = "0"
            result.text = "0"
        }

        supportActionBar?.hide()


    }


    fun addExpression(string: String, clear: Boolean) {

        var result = binding.result
        var expression = binding.expression

        if (result.text.isNotEmpty()) {
            expression.text = ""
        }

        if (clear) {
            result.text = ""
            expression.append(string)
        } else {
            expression.append(result.text)
            expression.append(string)
            result.text = "0"
        }

    }

}
