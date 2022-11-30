package com.example.skyrimcheats

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.skyrimcheats.adapter.ElementAdapter
import com.example.skyrimcheats.element.Element

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView : RecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = ElementAdapter()
        fun getItems() : ArrayList<Element>{
            return arrayListOf(
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
                    R.drawable.magic,
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
        }
        adapter.elements = getItems()
        recyclerView.adapter = adapter
    }
}