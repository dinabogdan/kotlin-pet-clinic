package com.freesoft.kotlinpetclinic.controllers

import com.freesoft.kotlinpetclinic.domain.PetOwner
import com.freesoft.kotlinpetclinic.service.PetOwnerService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class PetOwnerController(private val petOwnerService: PetOwnerService) {

    @GetMapping("/pet-owners")
    fun showAllPetOwners() = petOwnerService.findAllPetOwners()

    @GetMapping("/pet-owners/{petOwnerId}")
    fun showPetOwnerById(@PathVariable(value = "petOwnerId") petOwnerId: Long): Optional<PetOwner>? =
            petOwnerService.findPetOwnerById(petOwnerId)

    @PostMapping("/pet-owners")
    fun createPetOwner(@RequestBody petOwner: PetOwner) = petOwnerService.createPetOwner(petOwner)

    @PutMapping("/pet-owners/{petOwnerId}")
    fun updatePetOwner(@PathVariable(value = "petOwnerId") petOwnerId: Long,
                       @RequestBody petOwner: PetOwner): PetOwner? = petOwnerService.updatePetOwner(petOwnerId, petOwner)
}