package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

@Entity
data class Pet(@Id
               @GeneratedValue(strategy = GenerationType.TABLE)
               @Column(name = "PET_ID", insertable = false, updatable = false)
               var id: Long? = null,
               var petName: String = "",
               @OneToOne(fetch = FetchType.LAZY)
               @JoinColumn(name = "TYPE_ID")
               var petType: Type? = null,
               @OneToOne(fetch = FetchType.LAZY)
               @JoinColumn(name = "PET_OWNER_ID")
               var petOwner: PetOwner? = null) {
        constructor(petName: String, petType: Type, petOwner: PetOwner) : this() {
                this.petName = petName
                this.petType = petType
                this.petOwner = petOwner
        }
}