package com.freesoft.kotlinpetclinic.controllers

import com.freesoft.kotlinpetclinic.domain.Veterinary
import com.freesoft.kotlinpetclinic.service.VeterinaryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VeterinaryController(private val veterinaryService: VeterinaryService) {

    @GetMapping("/vets")
    fun showAllVets(): Iterable<Veterinary> = veterinaryService.findAllVeterinaries()
}