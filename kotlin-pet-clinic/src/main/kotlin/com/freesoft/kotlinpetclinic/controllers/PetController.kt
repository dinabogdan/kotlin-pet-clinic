package com.freesoft.kotlinpetclinic.controllers

import com.freesoft.kotlinpetclinic.domain.Pet
import com.freesoft.kotlinpetclinic.dto.CreatePetDto
import com.freesoft.kotlinpetclinic.service.PetService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class PetController(private val petService: PetService) {

    @GetMapping("/pets/{petId}")
    fun findPetById(@PathVariable(value = "petId") petId: Long): Optional<Pet> = petService.findById(petId)

    @GetMapping("/pets")
    fun findAllPets(): Iterable<Pet> = petService.findAllPets()

    @PostMapping("/pets")
    fun createPet(@RequestBody petDto: CreatePetDto) = petService.createPet(petDto)

    @PutMapping("/pets/{petId}")
    fun updatePet(@PathVariable(value = "petId") petId: Long, @RequestBody pet: Pet) = petService.updatePet(petId, pet)
}