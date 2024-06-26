package com.mercadolivro.controller.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PostCustomerRequest (
        @field:NotEmpty(message = "Nome deve ser informado")
        var name: String,

        @field:Email(message = "E-mail deve ser válido")
        var email: String,

        @field:NotEmpty(message = "Senha deve ser informada")
        var password: String
)