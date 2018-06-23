package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.PetOwner
import com.freesoft.kotlinpetclinic.repository.PetOwnerRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class PetOwnerService(private val petOwnerRepository: PetOwnerRepository) {

    fun createPetOwner(petOwner: PetOwner): PetOwner = petOwnerRepository.save(petOwner)

    fun findPetOwnerById(id: Long): Optional<PetOwner>? = petOwnerRepository.findById(id)

    fun findAllPetOwners(): Iterable<PetOwner>? = petOwnerRepository.findAll()

    fun updatePetOwner(petOwnerId: Long, petOwner: PetOwner): PetOwner? {
        val optionalRetrievedPetOwner = petOwnerRepository.findById(petOwnerId)
        if (optionalRetrievedPetOwner.isPresent) {
            var retrievedPetOwner = optionalRetrievedPetOwner.get()
            retrievedPetOwner.firstName = petOwner.firstName
            retrievedPetOwner.lastName = petOwner.lastName
            petOwnerRepository.save(retrievedPetOwner)
            return retrievedPetOwner
        }
        return null
    }}