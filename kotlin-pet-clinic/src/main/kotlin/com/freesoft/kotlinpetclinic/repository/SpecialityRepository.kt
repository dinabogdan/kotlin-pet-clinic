package com.freesoft.kotlinpetclinic.repository

import com.freesoft.kotlinpetclinic.domain.Speciality
import org.springframework.data.repository.CrudRepository

interface SpecialityRepository : CrudRepository<Speciality, Long>