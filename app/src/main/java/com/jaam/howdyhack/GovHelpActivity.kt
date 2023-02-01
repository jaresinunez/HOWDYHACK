package com.jaam.howdyhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaam.howdyhack.databinding.ActivityGovHelpBinding

class GovHelpActivity : AppCompatActivity() {
    lateinit var binding: ActivityGovHelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGovHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mybutton.setOnClickListener {
            val i = Intent(this, DashboardActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}