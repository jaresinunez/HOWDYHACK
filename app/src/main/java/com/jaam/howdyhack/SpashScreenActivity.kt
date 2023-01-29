package com.jaam.howdyhack

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

 class SpashScreenActivity : AppCompatActivity() {
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)
        handler=Handler()
        handler.postDelayed({
            val i = Intent(this, DashboardActivity::class.java)
            startActivity(i)
            finish()
        }, 3500)
    }
}