package com.javasampleapproach.kotlin.h2.repository

import org.springframework.data.repository.CrudRepository
import com.javasampleapproach.kotlin.h2.model.User

interface CustomerRepository: CrudRepository<User, Long>{
    fun findByLastName(lastName: String): List<User>
} 
