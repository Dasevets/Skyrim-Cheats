package com.example.skyrimcheats.element

class ElementAnnotation {

    private val stateL = listOf(
        "state1\n",
        "state2\n",
        "state3\n"
    )
    private val iddqdL = listOf(
        "iddqdd1\n",
        "iddqd2\n",
        "iddqd3\n"
    )
    private val skillL = listOf(
        "skill1\n",
        "skill2\n",
        "skill3\n"
    )
    private val weaponL = listOf(
        "weapon1\n",
        "weapon2\n",
        "weapon3\n"
    )
    private val armorL = listOf(
        "armor1\n",
        "armor2\n",
        "armor3\n"
    )
    private val eatL = listOf(
        "eat1\n",
        "eat2\n",
        "eat3\n"
    )
    private val itemL = listOf(
        "item1\n",
        "item2\n",
        "item3\n"
    )

    var annotList = mutableListOf(stateL, iddqdL, skillL, weaponL, armorL, eatL, itemL)
//    fun getAnnList(): MutableList<List<String>> {
//        return annotList
//    }

}