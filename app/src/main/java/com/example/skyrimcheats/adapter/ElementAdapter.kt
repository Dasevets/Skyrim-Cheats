package com.example.skyrimcheats.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.skyrimcheats.R
import com.example.skyrimcheats.element.Element

class ElementAdapter : RecyclerView.Adapter<ElementAdapter.ElementViewHolder>() {

    lateinit var elements :List<Element>

    class ElementViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon = itemView.findViewById<ImageView>(R.id.icon)
        val textName = itemView.findViewById<TextView>(R.id.name)
        val textDesc = itemView.findViewById<TextView>(R.id.desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementViewHolder {
        return ElementViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.element, parent, false))
    }

    override fun onBindViewHolder(holder: ElementViewHolder, position: Int) {

        holder.icon.setImageResource(elements[position].idIcon)
        holder.textName.text = elements[position].name
        holder.textDesc.text = elements[position].desc
    }

    override fun getItemCount(): Int {
        return elements.size
    }
}


