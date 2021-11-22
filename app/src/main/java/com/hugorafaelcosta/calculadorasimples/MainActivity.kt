package com.hugorafaelcosta.calculadorasimples

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hugorafaelcosta.calculadorasimples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var tvEntrada: TextView? = null
    private var tvResultado: TextView? = null
    var lastNum: Boolean = false
    var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvEntrada = binding.entrada
        tvResultado = binding.result

        binding.btnNumber0.setOnClickListener {
            getDigitos(binding.btnNumber0)
        }
        binding.btnNumberOne.setOnClickListener {
            getDigitos(binding.btnNumberOne)
        }
        binding.btnNumberTwo.setOnClickListener {
            getDigitos(binding.btnNumberTwo)
        }
        binding.btnNumberThree.setOnClickListener {
            getDigitos(binding.btnNumberThree)
        }
        binding.btnNumberFour.setOnClickListener {
            getDigitos(binding.btnNumberFour)
        }
        binding.btnNumberFive.setOnClickListener {
            getDigitos(binding.btnNumberFive)
        }
        binding.btnNumberSix.setOnClickListener {
            getDigitos(binding.btnNumberSix)
        }
        binding.btnNumberSeven.setOnClickListener {
            getDigitos(binding.btnNumberSeven)
        }
        binding.btnNumberEight.setOnClickListener {
            getDigitos(binding.btnNumberEight)
        }
        binding.btnNumberNine.setOnClickListener {
            getDigitos(binding.btnNumberNine)
        }
        binding.btnDot.setOnClickListener {
            decimal(binding.btnDot)
        }

        binding.btnClear.setOnClickListener {
            clearAll(binding.btnClear)
        }

        binding.btnClear.setOnClickListener {
            clearAll(binding.btnClear)
        }

    }

    fun getDigitos(view: View) {
        tvEntrada?.append((view as Button).text)
        lastNum = true
        lastDot = false
    }

    fun clearAll(view: View) {
        tvEntrada?.text = " "
        tvResultado?.text = " "
    }

    fun decimal(view: View) {
        if (lastNum && !lastDot) {
            tvEntrada?.append(".")
            lastNum = false
            lastDot = true
        }
    }

    private fun isSumOperator(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/")
                    || value.contains("*")
                    || value.contains("+")
                    || value.contains("-")
        }
    }


}
