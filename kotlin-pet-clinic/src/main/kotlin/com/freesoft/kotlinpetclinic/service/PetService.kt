package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Pet
import com.freesoft.kotlinpetclinic.dto.CreatePetDto
import com.freesoft.kotlinpetclinic.repository.PetOwnerRepository
import com.freesoft.kotlinpetclinic.repository.PetRepository
import com.freesoft.kotlinpetclinic.repository.TypeRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class PetService(private val petRepository: PetRepository,
                 private val petOwnerRepository: PetOwnerRepository,
                 private val petTypeRepository: TypeRepository) {

    fun findById(id: Long): Optional<Pet> = petRepository.findById(id)

    fun findAllPets(): Iterable<Pet> = petRepository.findAll()

    fun createPet(petDto: CreatePetDto) {
        val pet: Pet = Pet()
        pet.petName = petDto.petName
        val petOwner = petOwnerRepository.findByFirstNameAndLastName(petDto.petOwnerFirstName, petDto.petOwnerLastName)
        pet.petOwner = petOwner
        val petType = petTypeRepository.findByTypeName(petDto.petType)
        pet.petType = petType
        petRepository.save(pet)
    }

    fun updatePet(petId: Long, newPet: Pet): Unit? {
        val oldPetOptional = petRepository.findById(petId)
        if (oldPetOptional.isPresent) {
            val oldPet = oldPetOptional.get()
            oldPet.petName = newPet.petName
            petRepository.save(oldPet)
        }
        throw RuntimeException("Pet not found!")
    }
}