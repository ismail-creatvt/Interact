package com.app.creatvt.interact

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = arrayListOf<Pair<Int, Int>>()
        data.add(Pair(50, 100))
        data.add(Pair(50, 30))
        data.add(Pair(50, 80))
        data.add(Pair(80, 50))
        data.add(Pair(90, 30))
        data.add(Pair(90, 30))
        data.add(Pair(10, 140))
        barGraph.setData(data)
    }
}
