package com.example.skyrimcheats.fragments


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.SearchView
import androidx.fragment.app.Fragment

import com.example.skyrimcheats.MainActivity
import com.example.skyrimcheats.R

import com.example.skyrimcheats.databinding.FragmentDetailsBinding
import com.example.skyrimcheats.element.Element
import com.example.skyrimcheats.element.ElementAnnotation
import java.util.zip.Inflater


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


    //    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//
//        inflater.inflate(R.menu.tool_bar, menu)
//
//        val menuItem = menu.findItem(R.id.search)
//
//        val searchView = menuItem.actionView as SearchView
//
//        val elementSearch = arguments?.get("elId") as Int
//
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                if (ElementAnnotation().annotList[elementSearch].contains(
//                        query
//                    )
//                ) {
//                    Log.i("search", "work")// вывести нужное, придумать как прицепить element
//                } else {
//                    Log.i("search", "not work")
//                }
//                return false
//
//            }
//
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                return false
//            }
//
//        })
//
//        //return super.onCreateOptionsMenu(menu)
//    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.search -> {

                    //Toast.makeText(DetailsFragment().context, "HI", Toast.LENGTH_SHORT).show()
                    Log.i("MYTag", "Check")
                    true
                }
                else -> false
            }
        }
        binding.toolBar.setNavigationOnClickListener {
            Log.i("BACK"," CLICK BACK")
            //           Toast.makeText(context,"back",Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }

        setElementDetails()

    }




    private fun setElementDetails() {


        val element = arguments?.get("element") as Element
        binding.detailsName.text = element.elName
        binding.detailsIcon.setImageResource(element.idIcon)
        binding.detailsDesc.text = element.elDesc
        binding.detailsAnnot.text = arguments?.getString("input")

    }
}