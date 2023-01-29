package com.jaam.howdyhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaam.howdyhack.databinding.ActivityBudgetBinding
import com.jaam.howdyhack.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continueButton?.setOnClickListener {
            val i = Intent(this,MaybeIncomeActivity::class.java)
            startActivity(i)
            finish()
        }

        binding.game1?.setOnClickListener {  }
        binding.game2?.setOnClickListener {  }
        binding.game3?.setOnClickListener {  }
        binding.game4?.setOnClickListener {  }

        binding.incomeButton.setOnClickListener {
            val i = Intent(this, IncomeActivity::class.java)
            startActivity(i)
            finish()
        }
        binding.spendingButton.setOnClickListener {
            val i = Intent(this, BudgetActivity::class.java)
            startActivity(i)
            finish()
        }
        binding.savingButton.setOnClickListener {
            val i = Intent(this, SavingsActivity::class.java)
            startActivity(i)
            finish()
        }
        binding.creditButton.setOnClickListener {
            val i = Intent(this, CreditActivity::class.java)
            startActivity(i)
            finish()
        }
        binding.govAssistanceButton.setOnClickListener {
            val i = Intent(this, GovHelpActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}