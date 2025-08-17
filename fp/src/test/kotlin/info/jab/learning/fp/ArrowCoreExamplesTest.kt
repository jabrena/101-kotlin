package info.jab.learning.fp

import arrow.core.*
import arrow.core.raise.either
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ArrowCoreExamplesTest {
    @Test
    fun `Option example`() {
        assertEquals(Some(4), ArrowCoreExamples.optionExample("test"))
        assertEquals(None, ArrowCoreExamples.optionExample(null))
    }

    @Test
    fun `Either example`() {
        assertEquals(42.right(), ArrowCoreExamples.eitherExample("42"))
        assertEquals("NaN".left(), ArrowCoreExamples.eitherExample("x"))
    }

    @Test
    fun `Validated example`() {
        val ok = ArrowCoreExamples.validatedExample(listOf(1,2,3))
        val bad = ArrowCoreExamples.validatedExample(listOf(1,-1))
        assertTrue(ok.isValid)
        assertTrue(bad.isInvalid)
    }

    @Test
    fun `NonEmptyList example`() {
        val nel = ArrowCoreExamples.nonEmptyListExample(1, listOf(2,3))
        assertEquals(listOf(1,2,3), nel.all)
    }

    @Test
    fun `raise either example`() {
        assertEquals(2.right(), ArrowCoreExamples.raiseEitherExample("4", "2"))
        assertEquals("NaN".left(), ArrowCoreExamples.raiseEitherExample("x", "2"))
        assertEquals("Div by zero".left(), ArrowCoreExamples.raiseEitherExample("4", "0"))
    }
}
