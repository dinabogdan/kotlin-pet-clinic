package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Speciality
import com.freesoft.kotlinpetclinic.repository.SpecialityRepository
import org.springframework.stereotype.Component

@Component
class SpecialityService(var specialityRepository: SpecialityRepository) {

    fun createSpeciality(speciality: Speciality) = specialityRepository.save(speciality)

    fun findSpecialityById(id: Long) = specialityRepository.findById(id)
}