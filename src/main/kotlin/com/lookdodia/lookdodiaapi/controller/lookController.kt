package com.lookdodia.lookdodiaapi.controller

import com.lookdodia.lookdodiaapi.model.Look
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/looks")
class LookController {

    private val looks = listOf(
        Look(1, "Casual", "Jeans + Camiseta"),
        Look(2, "Trabalho", "Social completo")
    )

    @GetMapping
    fun getAllLooks(): List<Look> {
        return looks
    }
}

