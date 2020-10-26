package com.javasampleapproach.kotlin.h2

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinSpringBootH2IntegrationApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringBootH2IntegrationApplication::class.java, *args)
}
