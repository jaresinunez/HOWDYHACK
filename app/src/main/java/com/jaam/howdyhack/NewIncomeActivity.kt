package com.jaam.howdyhack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaam.howdyhack.databinding.ActivityNewIncomeBinding

class NewIncomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityNewIncomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewIncomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}