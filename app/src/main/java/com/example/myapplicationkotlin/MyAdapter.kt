package com.example.myapplicationkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MyAdapter(var onCLickInterface : OnCLickInterface,var click :((Int) -> Unit) ?= null,var clickTemp :((Int) -> Unit) ?= null) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    var context : Context ?= null
    class ViewHolder(var itemView : View) : RecyclerView.ViewHolder(itemView){
var txtView=itemView.findViewById<TextView>(R.id.txtView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context=parent.context
      var v= LayoutInflater.from(context).inflate(R.layout.item_file,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtView.setOnClickListener {
            click?.invoke(position)
            onCLickInterface.clickItem(position)
        }



    }

    override fun getItemCount(): Int {
      return 10
    }
}


interface OnCLickInterface
{
    fun clickItem(position: Int)
}