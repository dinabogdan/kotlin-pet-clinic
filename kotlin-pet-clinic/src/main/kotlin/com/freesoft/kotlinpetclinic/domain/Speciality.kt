package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

@Entity
data class Speciality(@Id
                      @GeneratedValue(strategy = GenerationType.TABLE)
                      @Column(name = "SPECIALITY_ID", updatable = false, insertable = false)
                      var id: Long? = null,
                      var speciality: String = "",
                      @Transient
                      @ManyToMany(mappedBy = "specialities")
                      private var veterinaries: Set<Veterinary>? = null)