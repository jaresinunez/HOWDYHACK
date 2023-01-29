package com.jaam.howdyhack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jaam.howdyhack.budgetScreens.Screen1
import com.jaam.howdyhack.budgetScreens.Screen2
import com.jaam.howdyhack.budgetScreens.Screen3
import com.jaam.howdyhack.databinding.ActivityCreditBinding
import com.jaam.howdyhack.databinding.ActivityIncomeBinding

private const val NUM_PAGES =1

class IncomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityIncomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIncomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pagerAdapter = IncomeActivityPagerAdapter(this)
        binding.coachingViewpager.adapter = pagerAdapter
        binding.dotsIndicator.setViewPager2(binding.coachingViewpager)

        binding.close.setOnClickListener {
            val i = Intent(this, DashboardActivity::class.java)
            startActivity(i)
            finish()
        }
    }
    private inner class IncomeActivityPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa){
        override fun getItemCount(): Int {
            return NUM_PAGES
        }

        override fun createFragment(position: Int): Fragment {
            var screen: Fragment
            when (position){
                0 -> {
                    screen = incomeScreen()
                }
                else -> {
                    screen = incomeScreen()
                }
            }
            return screen
        }

    }
}