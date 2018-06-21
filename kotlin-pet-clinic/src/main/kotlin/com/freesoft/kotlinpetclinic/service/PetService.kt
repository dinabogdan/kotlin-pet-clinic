package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Pet
import com.freesoft.kotlinpetclinic.repository.PetRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class PetService(var petRepository: PetRepository) {

    fun createPet(pet: Pet) = petRepository.save(pet)

    fun findPetById(id: Long): Optional<Pet> = petRepository.findById(id)
}