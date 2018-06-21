package com.freesoft.kotlinpetclinic.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {

    @GetMapping("/")
    fun welcome(): String {
        return "Hello from Kotlin island!"
    }
}