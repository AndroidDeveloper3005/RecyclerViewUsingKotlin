package com.androiddeveloper3005.myapplication.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.androiddeveloper3005.myapplication.adapter.Adapter
import com.androiddeveloper3005.myapplication.models.Lists
import com.androiddeveloper3005.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layoutManager  = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycler_view.layoutManager = layoutManager

        val adapter =
            Adapter(this, Lists.list)
        recycler_view.adapter = adapter

    }
}
