package com.example.testingtutorials

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilsTest {
    @Test
    fun `empty username return false`(){
        var result = RegistrationUtils.validRegistrationInput("","123456","123456")
        assertThat(result).isFalse()
    }

    @Test
    fun `password not match confirm password return false`(){
        var result  = RegistrationUtils.validRegistrationInput("email" , "123","1213313")
        assertThat(result).isFalse()
    }

    @Test
    fun `password match confirm password return true`(){
        var result = RegistrationUtils.validRegistrationInput("email"  , "123456" , "123456")
        assertThat(result).isTrue()
    }

    @Test
    fun `password length less than 6 digits return false` (){
        var result = RegistrationUtils.validRegistrationInput("email" , "123" , "123")
        assertThat(result).isFalse()
    }
}