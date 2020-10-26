package com.javasampleapproach.kotlin.h2.model

import java.sql.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customer")
public class    User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,

    @Column(name = "firstname")
    val firstName: String = "",

    @Column(name = "lastname")
    val lastName: String = "",

    @Column(name = "mail")
    val mail: String = "",

    @Column(name = "registrationDate")
    val registrationDate: Date = Date(11, 7, 1995)
) {
    override fun toString(): String {
        return "Customer[id=${id}, firstName=${firstName}, lastName=${lastName}, mail=${mail}, registrationDate=${registrationDate}]"
    }
}
