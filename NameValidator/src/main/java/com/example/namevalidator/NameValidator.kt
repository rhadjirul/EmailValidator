package com.example.namevalidator

class NameValidator {
    fun isValidName(name: String?): Boolean {
        return !name?.trim().isNullOrEmpty()
    }
}