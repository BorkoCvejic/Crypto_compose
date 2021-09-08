package com.easycruise.crypto_compose_practice.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Links(
    val explorer: List<Any>,
    val facebook: List<Any>,
    val medium: Any,
    val reddit: List<Any>,
    @SerializedName("source_code")
    val source_code: List<Any>,
    val website: List<Any>,
    val youtube: List<Any>
)