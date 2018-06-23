package com.freesoft.kotlinpetclinic.controllers

import com.freesoft.kotlinpetclinic.service.TypeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TypeController(private val typeService: TypeService) {

    @GetMapping("/types")
    fun showAllTypes() = typeService.showAllTypes()

}