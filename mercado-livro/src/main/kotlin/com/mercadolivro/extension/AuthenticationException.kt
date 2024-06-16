package com.mercadolivro.extension

class AuthenticationException(override val message: String, val errorCode: String) : Exception() {
}