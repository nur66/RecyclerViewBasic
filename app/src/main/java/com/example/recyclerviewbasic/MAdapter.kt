package com.example.recyclerviewbasic

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MAdapter(private val context: Context, private val tvArray: Array<String>) : RecyclerView.Adapter<MAdapter.MViewHolder>() {
    inner class MViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val mTV = view.findViewById<TextView>(R.id.mTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.custom_item_layout,parent,false)
        return MViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tvArray.size
    }

    override fun onBindViewHolder(holder: MViewHolder, position: Int) {
        holder.mTV.text = tvArray[position]
    }
}