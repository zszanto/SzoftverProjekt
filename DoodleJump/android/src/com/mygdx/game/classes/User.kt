package com.mygdx.game.classes

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

const val USER_CLASS = "User"
@IgnoreExtraProperties
data class User(
        var userId: String? = "",
        var userName: String? = "",
        var password: String? = "",
        var scores: ArrayList<String>?
) : Serializable