package com.example.w24w07Webserver.Service

import com.example.w24w07Webserver.model.Song
import org.springframework.stereotype.Service
import kotlin.random.Random
import com.example.w24w07Webserver.repository.SongRepository

@Service
class songService(val songRepository: SongRepository) {
    fun getRandomSong(): Song {
        return songRepository.getSong(Random.nextInt(songRepository.songSize()))
    }
}