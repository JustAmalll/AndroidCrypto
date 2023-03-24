package dev.amal.androidcrypto

import androidx.annotation.Keep

@Keep
@kotlinx.serialization.Serializable
data class UserSettings(
    val username: String? = null,
    val password: String? = null
)