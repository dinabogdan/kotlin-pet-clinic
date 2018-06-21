package com.freesoft.kotlinpetclinic.repository

import com.freesoft.kotlinpetclinic.domain.Pet
import org.springframework.data.repository.CrudRepository

interface PetRepository : CrudRepository<Pet, Long>