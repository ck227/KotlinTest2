package com.ck.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by cnbs5 on 17/6/14.
 */
class MainAdapter(fm: FragmentManager, val mFragments: List<Fragment>) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return mFragments[position]
    }

    override fun getCount(): Int {



        return mFragments.size
    }

//    override fun getPageTitle(position: Int): CharSequence {
//        return mTitles[position]
//    }
}