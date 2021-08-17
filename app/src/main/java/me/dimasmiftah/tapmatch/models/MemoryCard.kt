package me.dimasmiftah.tapmatch.models

data class MemoryCard(
        val identifier: Int,
        val imageUrl: String? = null,
        var isFaceUP: Boolean = false,
        var isMatched: Boolean = false
)