package com.sachin.androidtesting2023

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun addTwoValues() {
        //Arrange
        val helper = Helper()

        //Act

        val result = helper.addTwoValues(12,97)

        //Assert
        assertEquals(109,result)
    }
}