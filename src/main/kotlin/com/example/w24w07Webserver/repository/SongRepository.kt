package com.example.w24w07Webserver.repository

import com.example.w24w07Webserver.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val result = listOf(
        Song(1, "Diver", "Nico touches the walls"),
        Song(2, "Dear..", "Siam Shade"),
        Song(3, "Soul love", "Glay"),
    )

    fun songSize():Int=result.size
    fun getSong(index:Int):Song=result[index]
}