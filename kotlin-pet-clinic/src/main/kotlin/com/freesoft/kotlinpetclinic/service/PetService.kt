package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Pet
import com.freesoft.kotlinpetclinic.repository.PetRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class PetService(private val petRepository: PetRepository) {

    fun findById(id: Long): Optional<Pet> = petRepository.findById(id)

    fun createPet(pet: Pet): Pet = petRepository.save(pet)
}