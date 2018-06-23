package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Type
import com.freesoft.kotlinpetclinic.repository.TypeRepository
import org.springframework.stereotype.Component

@Component
class TypeService(private val typeRepository: TypeRepository) {

    fun createNewType(type: Type): Type = typeRepository.save(type)

    fun showAllTypes(): Iterable<Type> = typeRepository.findAll()
}