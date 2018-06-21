package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

class Pet(
        @Id
        @Column(name = "PET_ID", updatable = false, insertable = false)
        @GeneratedValue(strategy = GenerationType.TABLE)
        val id: Long,
        val petName: String,
        @OneToOne(mappedBy = "pet", cascade = [(CascadeType.ALL)],
                fetch = FetchType.LAZY, optional = false)
        val petOwner: PetOwner)