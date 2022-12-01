package com.example.skyrimcheats.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skyrimcheats.MainActivity
import com.example.skyrimcheats.R
import com.example.skyrimcheats.adapter.ElementAdapter
import com.example.skyrimcheats.databinding.FragmentHomeBinding
import com.example.skyrimcheats.element.Element



class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var elementAdapter: ElementAdapter
    private val elementDB = listOf(
        Element(
            0,
            "State",
            R.drawable.logo,
            "Сharacter states cheats"
        ),
        Element(
            1,
            "IDDQD",
            R.drawable.logo,
            "General cheats (may break the game)"
        ),
        Element(
            2,
            "Skill",
            R.drawable.skill,
            "Cheats for skill"
        ),
        Element(
            3,
            "Weapon",
            R.drawable.weapon,
            "ID weapons"
        ),
        Element(
            4,
            "Armor",
            R.drawable.armor,
            "ID armor"
        ),
        Element(
            5,
            "Eat",
            R.drawable.eat,
            "ID eats"
        ),
        Element(
            6,
            "Item",
            R.drawable.item,
            "ID items"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.recyclerView.apply {
            elementAdapter = ElementAdapter(object : ElementAdapter.OnItemClickListener {

                override fun click(element: Element) {
                    (requireActivity() as MainActivity).launchDetailsFragment(element)
                    Log.i("TAG", "CLICK")
                }
            })

            adapter = elementAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        elementAdapter.addItems(elementDB)
    }


}