package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

@Entity
data class PetOwner(
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        @Column(name = "PET_OWNER_ID", updatable = false, insertable = false)
        var id: Long? = null,
        var firstName: String? = null,
        var lastName: String? = null) {
        constructor(firstName: String, lastName: String) : this() {
                this.firstName = firstName
                this.lastName = lastName
        }
}