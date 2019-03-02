package com.apps.a7pl4y3r.tasks.dayfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.apps.a7pl4y3r.tasks.R

class Tuesday : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_day, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val day: TextView = view.findViewById(R.id.day_textView)
        day.setText(R.string.tuesday)

    }
}