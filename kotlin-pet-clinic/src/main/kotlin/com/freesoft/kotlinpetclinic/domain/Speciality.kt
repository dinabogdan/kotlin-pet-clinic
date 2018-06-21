package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

@Entity
data class Speciality(@Id
                      @GeneratedValue(strategy = GenerationType.SEQUENCE)
                      @Column(name = "SPECIALITY_ID", insertable = false, updatable = false)
                      val id: Long,
                      @Column(name = "SPECIALITY_TYPE")
                      val type: String,
                      @ManyToOne(fetch = FetchType.LAZY)
                      @JoinColumn(name = "VETERINARY_ID")
                      val veterinary: Veterinary)