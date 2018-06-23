package com.freesoft.kotlinpetclinic.controllers

import com.freesoft.kotlinpetclinic.domain.Pet
import com.freesoft.kotlinpetclinic.service.PetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class PetController(private val petService: PetService) {

    @GetMapping("/pets/{petId}")
    fun findPetById(@PathVariable(value = "petId") petId: Long): Optional<Pet> = petService.findById(petId)
}