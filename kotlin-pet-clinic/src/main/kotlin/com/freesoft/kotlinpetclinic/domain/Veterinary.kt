package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

@Entity
data class Veterinary(@Id
                      @GeneratedValue(strategy = GenerationType.TABLE)
                      @Column(name = "VETERINARY_ID", updatable = false, insertable = false)
                      var id: Long? = null,
                      var firstName: String = "",
                      var lastName: String = "",
                      @ManyToMany
                      @JoinTable(name = "SPECIALITY_VETERINARY",
                              joinColumns = [(JoinColumn(name = "VETERINARY_ID"))],
                              inverseJoinColumns = [(JoinColumn(name = "SPECIALITY_ID"))]
                      )
                      var specialities: Set<Speciality>? = null) {
        constructor(firstName: String, lastName: String, specialities: Set<Speciality>) : this() {
                this.firstName = firstName
                this.lastName = lastName
                this.specialities = specialities
        }
}