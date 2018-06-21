package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Veterinary
import com.freesoft.kotlinpetclinic.repository.VeterinaryRepository
import org.springframework.stereotype.Component

@Component
class VeterinaryService(var veterinaryRepository: VeterinaryRepository) {

    fun createVeterinary(veterinary: Veterinary) = veterinaryRepository.save(veterinary)

    fun findVeterinaryById(id: Long) = veterinaryRepository.findById(id)
}