package com.jaam.howdyhack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jaam.howdyhack.SavingsScreens.SavingScreen1
import com.jaam.howdyhack.SavingsScreens.SavingScreen2
import com.jaam.howdyhack.SavingsScreens.SavingScreen3
import com.jaam.howdyhack.databinding.ActivityBudgetBinding

private const val NUM_PAGES =3

class SavingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBudgetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBudgetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pagerAdapter = BudgetActivityPagerAdapter(this)
        binding.coachingViewpager.adapter = pagerAdapter
        binding.dotsIndicator.setViewPager2(binding.coachingViewpager)
    }

    private inner class BudgetActivityPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa){
        override fun getItemCount(): Int {
            return NUM_PAGES
        }

        override fun createFragment(position: Int): Fragment {
            var sscreen: Fragment
            when (position){
                0 -> {
                    sscreen = SavingScreen1()
                }
                1 -> {
                    sscreen = SavingScreen2()
                }
                2 -> {
                    sscreen = SavingScreen3()
                }
                else -> {
                    sscreen = SavingScreen1()
                }
            }
            return sscreen
        }

    }
}