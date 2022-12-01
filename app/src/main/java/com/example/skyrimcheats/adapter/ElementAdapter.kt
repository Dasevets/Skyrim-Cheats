package com.example.skyrimcheats.adapter

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils.indexOf
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import com.example.skyrimcheats.MainActivity
import com.example.skyrimcheats.databinding.ElementBinding
import com.example.skyrimcheats.element.Element
import com.example.skyrimcheats.element.ElementAnnotation


class ElementAdapter(private val clickListener: OnItemClickListener)/*(private val elements: List<Element>)*/ :
    RecyclerView.Adapter<ElementAdapter.ElementViewHolder>() {

    private var elements = mutableListOf<Element>()

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementViewHolder {
        val binding = ElementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ElementViewHolder(binding)

    }

    class ElementViewHolder(val binding: ElementBinding) : RecyclerView.ViewHolder(binding.root) {

    }


    override fun onBindViewHolder(holder: ElementViewHolder, position: Int) {



        with(holder) {
            with(elements[position]) {
                binding.name.text = elName
                binding.icon.setImageResource(elements[position].idIcon)
                binding.desc.text = elDesc


                holder.itemView.setOnClickListener {
                    clickListener.click(elements[position])

                }
            }
        }
    }



    override fun getItemCount(): Int {
        return elements.size
    }

    fun addItems(list: List<Element>) {
        elements.clear()
        elements.addAll(list)
        notifyDataSetChanged()

    }

    interface OnItemClickListener {
        fun click(element: Element)
    }
}




