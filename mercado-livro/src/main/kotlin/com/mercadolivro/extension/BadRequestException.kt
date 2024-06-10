package com.mercadolivro.extension

class BadRequestException(override val message: String, val errorCode: String): Exception() {
}