package com.example.skyrimcheats

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call.Details
import androidx.recyclerview.widget.RecyclerView
import com.example.skyrimcheats.adapter.ElementAdapter
import com.example.skyrimcheats.element.Element
import com.example.skyrimcheats.fragments.DetailsFragment
import com.example.skyrimcheats.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_placeholder, HomeFragment())
            .addToBackStack(null)
            .commit()


    }

    fun launchDetailsFragment(element: Element) {
        val bundle = Bundle()
        bundle.putParcelable("element", element)
        val fragment = DetailsFragment()
        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_placeholder, fragment)
            .addToBackStack(null)
            .commit()
    }
}




