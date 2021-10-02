package com.example.kotlinclass3

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SupportDTO : Serializable {
    @SerializedName("url")
    val url: String? = null

    @SerializedName("text")
    val text: String? = null
}