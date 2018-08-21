package me.khongcham.bottomnav

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class BottomNavPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(pos: Int): Fragment? {
        return when(pos){
            0 -> HomeFragment()
            1 -> DashboardFragment()
            2 -> NotiFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return 3
    }

}