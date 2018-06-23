package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Speciality
import com.freesoft.kotlinpetclinic.repository.SpecialityRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class SpecialityService(var specialityRepository: SpecialityRepository) {

    fun createVeterinarySpeciality(speciality: Speciality): Speciality = specialityRepository.save(speciality)

    fun getVeterinarySpecialityById(id: Long): Optional<Speciality>? = specialityRepository.findById(id)
}