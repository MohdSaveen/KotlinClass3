package com.example.kotlinclass3

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ResponseDTO : Serializable {
    @SerializedName("data")
    val data: DataDTO? = null

    @SerializedName("support")
    val support: SupportDTO? = null
}