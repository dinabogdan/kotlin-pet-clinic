package com.freesoft.kotlinpetclinic.repository

import com.freesoft.kotlinpetclinic.domain.Visit
import org.springframework.data.repository.CrudRepository

interface VisitRepository : CrudRepository<Visit, Long>