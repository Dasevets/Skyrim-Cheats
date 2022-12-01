package com.example.skyrimcheats.element

class ElementAnnotation {

    val stateL = listOf<String>(
        "state1",
        "state2",
        "state3"
    )
    val iddqdL = listOf<String>(
        "iddqd1",
        "iddqd2",
        "iddqd3"
    )
    val skillL = listOf<String>(
        "skill1",
        "skill2",
        "skill3"
    )
    val weaponL = listOf<String>(
        "weapon1",
        "weapon2",
        "weapon3"
    )
    val armorL = listOf<String>(
        "armor1",
        "armor2",
        "armor3"
    )
    val eatL = listOf<String>(
        "eat1",
        "eat2",
        "eat3"
    )
    val itemL = listOf<String>(
        "item1",
        "item2",
        "item3"
    )

    var annotList = mutableListOf(stateL, iddqdL, skillL, weaponL, armorL, eatL, itemL)
    fun getAnnList(): MutableList<List<String>> {
        return annotList
    }

}