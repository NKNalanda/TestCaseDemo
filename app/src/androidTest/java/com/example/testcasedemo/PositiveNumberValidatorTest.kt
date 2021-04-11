package com.example.testcasedemo

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PositiveNumberValidatorTest {
    lateinit var SUT: PositiveNumberValidator

    @Before
    fun setUp() {
        SUT = PositiveNumberValidator()
    }

    @Test
    fun test1() {
        val result: Boolean = SUT.isPositive(-1)
        assertFalse(result)
    }

    @Test
    fun test2() {
        val result: Boolean = SUT.isPositive(0)
        assertFalse(result)
    }

    @Test
    fun test3() {
        val result: Boolean = SUT.isPositive(2)
        assertTrue(result)
    }
    
}