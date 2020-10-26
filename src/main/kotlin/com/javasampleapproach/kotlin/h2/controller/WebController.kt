package com.javasampleapproach.kotlin.h2.controller

import com.javasampleapproach.kotlin.h2.model.User
import com.javasampleapproach.kotlin.h2.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.sql.Date

@RestController
class WebController {

    @Autowired
    lateinit var repository: CustomerRepository

    @RequestMapping("/save")
    fun process(
        @RequestParam("firstname") firstname: String,
        @RequestParam("lastname") lastName: String,
        @RequestParam("mail") mail: String,
        @RequestParam("registrationDate") registrationDate: Date = Date(11, 7, 1995)): String {
        repository.save(User(1, firstname, lastName, mail, registrationDate))
        return "Done"
    }

    @RequestMapping("/update")
    fun update(@PathVariable id: Long, @RequestBody user: User) {
        repository.delete(findById(id))
        repository.save(user)
    }

    @RequestMapping("/findall")
    fun findAll(): String {
        var result = ""

        for (cust in repository.findAll()) {
            result += cust.toString() + "</br>"
        }

        return result
    }

    @RequestMapping("/findbyid")
    fun findById(@RequestParam("id") id: Long): User {
        return repository.findOne(id)
    }

    @RequestMapping("/findbylastname")
    fun fetchDataByLastName(@RequestParam("lastname") lastName: String): String {
        var result = ""

        for (cust in repository.findByLastName(lastName)) {
            result += cust.toString() + "</br>"
        }

        return result
    }
}
