package com.freesoft.kotlinpetclinic.repository

import com.freesoft.kotlinpetclinic.domain.Type
import org.springframework.data.repository.CrudRepository

interface TypeRepository:CrudRepository<Type, Long>