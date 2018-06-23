package com.freesoft.kotlinpetclinic.domain

import javax.persistence.*

@Entity
data class Type(
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        @Column(name = "TYPE_ID", insertable = false, updatable = false)
        var id: Long? = null,
        var typeName: String = "") {
    constructor(typeName: String) : this() {
        this.typeName = typeName
    }
}