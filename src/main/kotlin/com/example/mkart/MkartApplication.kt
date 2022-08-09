package com.example.mkart

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MkartApplication

fun main(args: Array<String>) {
    runApplication<MkartApplication>(*args)
}