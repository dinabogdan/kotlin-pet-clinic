package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

@Entity
data class Veterinary(
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        @Column(name = "VETERINARY_ID", insertable = false, updatable = false)
        val id: Long,
        val firstName: String,
        val lastName: String,
        @OneToMany(mappedBy = "veterinary", cascade = [(CascadeType.ALL)])
        val specialities: List<Speciality>)