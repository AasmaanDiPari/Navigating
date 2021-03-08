package com.harry.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.harry.adapters.HobbiesAdapter
import com.harry.R
import com.harry.models.Model
import kotlinx.android.synthetic.main.hobbies_activity.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hobbies_activity)
        setLayout()
    }

    private fun setLayout() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Model.Hobby.Supplier.hobbies)
        recyclerView.adapter = adapter

    }
}

