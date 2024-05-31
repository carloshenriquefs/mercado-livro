package com.mercadolivro.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun helloWorld(): String {
        return "Hello World"
    }

    @GetMapping("/2")
    fun customer2(): String {
        return "Customer 2"
    }
}