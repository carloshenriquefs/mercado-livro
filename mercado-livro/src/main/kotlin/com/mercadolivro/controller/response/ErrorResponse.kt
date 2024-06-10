package com.mercadolivro.controller.response

data class ErrorResponse(
        val httpCode: Int,
        var message: String,
        val internalCode: String,
        var errors: List<FieldErrorResponse>?
)