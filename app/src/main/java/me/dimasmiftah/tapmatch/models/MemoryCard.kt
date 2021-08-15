package me.dimasmiftah.tapmatch.models

data class MemoryCard(
        val identifier: Int,
        var isFaceUP: Boolean = false,
        var isMatched: Boolean = false
)