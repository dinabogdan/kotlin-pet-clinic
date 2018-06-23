package com.freesoft.kotlinpetclinic.repository

import com.freesoft.kotlinpetclinic.domain.PetOwner
import org.springframework.data.repository.CrudRepository

interface PetOwnerRepository : CrudRepository<PetOwner, Long> {
    fun findByFirstNameAndLastName(firstName: String, lastName: String): PetOwner
}