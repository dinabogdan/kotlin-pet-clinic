package com.freesoft.kotlinpetclinic.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Visit(
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        @Column(name = "VISIT_ID", insertable = false, updatable = false)
        var id: Long,
        var visitDate: LocalDateTime,
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "PET_ID")
        var pet: Pet)