package com.apps.a7pl4y3r.tasks.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class DayAdapter(fm: FragmentManager, private val items: ArrayList<Fragment>) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment = items[position]

    override fun getCount(): Int = items.size

}