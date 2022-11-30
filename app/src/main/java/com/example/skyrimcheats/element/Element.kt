package com.example.skyrimcheats.element

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes

class Element(var id: Int, var elName: String, @DrawableRes var idIcon: Int, var elDesc: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(elName)
        parcel.writeInt(idIcon)
        parcel.writeString(elDesc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Element> {
        override fun createFromParcel(parcel: Parcel): Element {
            return Element(parcel)
        }

        override fun newArray(size: Int): Array<Element?> {
            return arrayOfNulls(size)
        }
    }
}