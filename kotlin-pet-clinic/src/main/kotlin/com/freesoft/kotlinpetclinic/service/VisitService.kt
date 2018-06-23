package com.freesoft.kotlinpetclinic.service

import com.freesoft.kotlinpetclinic.domain.Visit
import com.freesoft.kotlinpetclinic.repository.VisitRepository

class VisitService(private val visitRepository: VisitRepository) {

    fun showAllVisits(): Iterable<Visit> = visitRepository.findAll()
}