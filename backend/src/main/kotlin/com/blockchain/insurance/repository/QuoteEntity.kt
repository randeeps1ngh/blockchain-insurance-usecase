package com.blockchain.insurance.repository

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class QuoteEntity {
    @Id
    @GeneratedValue
    @Column
    var id: Long = 0
    @Column
    lateinit var firstName: String
    @Column
    lateinit var lastName: String

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }
}