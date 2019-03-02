package com.apps.a7pl4y3r.tasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.apps.a7pl4y3r.tasks.adapters.DayAdapter
import com.apps.a7pl4y3r.tasks.dayfragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(mainToolbar)
        setViewPager()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_settings, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        return when (item?.itemId) {

            R.id.item_settings -> {true}

            else -> false

        }

    }


    private fun setViewPager() {

        val items = ArrayList<Fragment>()
        val adapter: DayAdapter

        items.add(Monday())
        items.add(Tuesday())
        items.add(Wednesday())
        items.add(Thursday())
        items.add(Friday())

        adapter = DayAdapter(supportFragmentManager, items)
        mainViewpager.adapter = adapter

    }

}
