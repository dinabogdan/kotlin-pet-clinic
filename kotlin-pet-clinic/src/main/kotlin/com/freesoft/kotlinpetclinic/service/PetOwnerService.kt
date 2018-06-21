package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.PetOwner
import com.freesoft.kotlinpetclinic.repository.PetOwnerRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class PetOwnerService(var petOwnerRepository: PetOwnerRepository) {

    fun createPetOwner(petOwner: PetOwner) = petOwnerRepository.save(petOwner)


    fun findPetOwnerById(id: Long): Optional<PetOwner> = petOwnerRepository.findById(id)
}