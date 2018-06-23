package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Veterinary
import com.freesoft.kotlinpetclinic.repository.VeterinaryRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class VeterinaryService(private val veterinaryRepository: VeterinaryRepository) {

    fun createVeterinary(veterinary: Veterinary): Veterinary = veterinaryRepository.save(veterinary)

    fun getVeterinaryById(id: Long): Optional<Veterinary>? = veterinaryRepository.findById(id)

    fun findAllVeterinaries() = veterinaryRepository.findAll()
}