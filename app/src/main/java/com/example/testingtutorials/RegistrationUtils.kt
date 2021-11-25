package com.example.testingtutorials

object RegistrationUtils {
    fun validRegistrationInput(email:String , password:String, passConfirm:String):Boolean{
        if (password.isEmpty() || email.isEmpty() || passConfirm.isEmpty()) return false
        if (passConfirm!=password) return false
        if (password.length<6) return false
        return true
    }
}