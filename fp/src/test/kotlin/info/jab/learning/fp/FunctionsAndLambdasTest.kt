package info.jab.learning.fp

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionsAndLambdasTest {
    @Test
    fun `applyTwice applies function twice`() {
        val square: (Int) -> Int = { it * it }
        assertEquals(81, FunctionsAndLambdas.applyTwice(3, square))
    }

    @Test
    fun `extension and inline benchmark`() {
        val result = FunctionsAndLambdas.benchmark<Int> { 5.double() }
        assertEquals(10, result)
    }
}
