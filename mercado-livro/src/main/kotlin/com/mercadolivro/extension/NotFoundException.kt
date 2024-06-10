package com.mercadolivro.extension

class NotFoundException(override val message: String, val errorCode: String): Exception() {
}