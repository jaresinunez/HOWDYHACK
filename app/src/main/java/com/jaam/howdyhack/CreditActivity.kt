package com.jaam.howdyhack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jaam.howdyhack.budgetScreens.Screen1
import com.jaam.howdyhack.budgetScreens.Screen2
import com.jaam.howdyhack.budgetScreens.Screen3
import com.jaam.howdyhack.databinding.ActivityCreditBinding
import java.util.zip.Inflater

private const val NUM_PAGES =3

class CreditActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreditBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pagerAdapter = CreditActivityPagerAdapter(this)
        binding.coachingViewpager.adapter = pagerAdapter
        binding.dotsIndicator.setViewPager2(binding.coachingViewpager)

    }

    private inner class CreditActivityPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa){
        override fun getItemCount(): Int {
            return NUM_PAGES
        }

        override fun createFragment(position: Int): Fragment {
            var screen: Fragment
            when (position){
                0 -> {
                    screen = Screen1()
                }
                1 -> {
                    screen = Screen2()
                }
                2 -> {
                    screen = Screen3()
                }
                else -> {
                    screen = Screen1()
                }
            }
            return screen
        }

    }
}