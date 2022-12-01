package com.example.skyrimcheats.fragments

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.skyrimcheats.MainActivity
import com.example.skyrimcheats.R
import com.example.skyrimcheats.adapter.ElementAdapter
import com.example.skyrimcheats.databinding.FragmentDetailsBinding
import com.example.skyrimcheats.element.Element


class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetailsBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolBar.setOnMenuItemClickListener{
            when(it.itemId) {
                R.id.search -> {
                    Toast.makeText(context, "HI", Toast.LENGTH_SHORT).show()
                    Log.i("MYTag", "Check")
                true
                }
                else -> false
            }
        }
        binding.toolBar.setNavigationOnClickListener{
            Toast.makeText(context,"back",Toast.LENGTH_SHORT).show()
        }


        setElementDetails()

    }


    private fun setElementDetails() {
        val element = arguments?.get("element") as Element
        binding.detailsName.text = element.elName
        binding.detailsIcon.setImageResource(element.idIcon)
        binding.detailsDesc.text = element.elDesc


    }


}