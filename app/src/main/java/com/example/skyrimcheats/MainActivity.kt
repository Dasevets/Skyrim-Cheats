package com.example.skyrimcheats


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.skyrimcheats.databinding.ActivityMainBinding
import com.example.skyrimcheats.element.Element
import com.example.skyrimcheats.fragments.DetailsFragment
import com.example.skyrimcheats.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

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




