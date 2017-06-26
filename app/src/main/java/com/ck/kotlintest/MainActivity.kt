package com.ck.kotlintest

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.ck.adapter.MainAdapter
import com.ck.fragment.DayFragment
import com.ck.fragment.HomeFragment
import com.ck.fragment.MyFragment
import com.ck.fragment.WeekFragment

class MainActivity : AppCompatActivity() {

    private var viewPager: ViewPager? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                viewPager!!.setCurrentItem(0, true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_day -> {
                viewPager!!.setCurrentItem(1, true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_week -> {
                viewPager!!.setCurrentItem(2, true)
                return@OnNavigationItemSelectedListener true

            }
            R.id.navigation_my -> {
                viewPager!!.setCurrentItem(3, true)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewpager) as ViewPager
        setupViewPager()
        val navigation = findViewById(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    fun setupViewPager() {
        val fragments = ArrayList<Fragment>()
        val listFragment = HomeFragment()
        fragments.add(listFragment)
        fragments.add(DayFragment())
        fragments.add(WeekFragment())
        fragments.add(MyFragment())
        val adapter = MainAdapter(supportFragmentManager, fragments)
        viewPager!!.adapter = adapter
//        viewPager!!.setPageTransformer(true, MTransformer())
    }
}
