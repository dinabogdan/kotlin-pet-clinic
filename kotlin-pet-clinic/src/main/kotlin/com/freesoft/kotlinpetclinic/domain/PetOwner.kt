package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

data class PetOwner(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "PET_OWNER_ID", updatable = false, insertable = false)
        val id: Long,
        val firstName: String,
        val lastName: String,
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "PET_ID")
        val pet: Pet)