package com.freesoft.kotlinpetclinic.repository

import com.freesoft.kotlinpetclinic.domain.Veterinary
import org.springframework.data.repository.CrudRepository

interface VeterinaryRepository : CrudRepository<Veterinary, Long>