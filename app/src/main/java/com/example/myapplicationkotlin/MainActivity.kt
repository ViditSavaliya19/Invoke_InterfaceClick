package com.example.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var rcvList=findViewById<RecyclerView>(R.id.rcvList)
        var myadapter=MyAdapter(object : OnCLickInterface{
            override fun clickItem(po : Int) {
                Log.e("TAG", "clickItem: "+"CLick" + po)
            }

        }, click = {

        }, clickTemp = {

        })

        var manager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rcvList.apply {
           layoutManager=manager
           adapter=myadapter
        }


    }


}