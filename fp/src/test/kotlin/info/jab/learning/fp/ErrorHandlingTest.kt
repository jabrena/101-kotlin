package info.jab.learning.fp

import info.jab.learning.fp.ErrorHandlingDemo.Either
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ErrorHandlingTest {
    @Test
    fun `divide returns Result`() {
        val ok = ErrorHandlingDemo.divide(6, 3)
        val err = ErrorHandlingDemo.divide(1, 0)
        assertEquals(2, ok.getOrNull())
        assertTrue(err.isFailure)
    }

    @Test
    fun `parseInt returns Either`() {
        val r1: Either<String, Int> = ErrorHandlingDemo.parseInt("42")
        val r2: Either<String, Int> = ErrorHandlingDemo.parseInt("x")
        when (r1) {
            is Either.Right -> assertEquals(42, r1.value)
            is Either.Left -> fail("Expected Right")
        }
        when (r2) {
            is Either.Right -> fail("Expected Left")
            is Either.Left -> assertEquals("Not a number", r2.value)
        }
    }
}
