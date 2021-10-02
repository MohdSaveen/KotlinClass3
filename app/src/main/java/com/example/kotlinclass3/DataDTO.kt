package com.example.kotlinclass3

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DataDTO : Serializable {
    @SerializedName("id")
    val id = 0

    @SerializedName("email")
    val email: String? = null

    @SerializedName("first_name")
    val firstName: String? = null

    @SerializedName("last_name")
    val lastName: String? = null

    @SerializedName("avatar")
    val avatar: String? = null
}