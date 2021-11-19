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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvEntrada = binding.entrada

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

    }

    fun getDigitos(view: View) {
        tvEntrada?.append((view as Button).text)
    }


}
