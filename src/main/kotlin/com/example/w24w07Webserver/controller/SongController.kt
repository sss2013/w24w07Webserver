package com.example.w24w07Webserver.controller

import com.example.w24w07Webserver.Service.songService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController (val service:songService) {
    @GetMapping("/Randomsong")
    fun getRandomSong(model : Model):String{
        model.addAttribute("song", service.getRandomSong())
        return "random"
    }
}