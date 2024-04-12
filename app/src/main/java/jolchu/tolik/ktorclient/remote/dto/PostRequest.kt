package jolchu.tolik.ktorclient.remote.dto

import kotlinx.serialization.Serializable

@Suppress("PLUGIN_IS_NOT_ENABLED")
@Serializable
data class PostRequest(
    val body: String,
    val title: String,
    val userId: Int
)