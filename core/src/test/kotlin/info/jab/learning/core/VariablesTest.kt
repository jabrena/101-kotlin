package info.jab.learning.core

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VariablesTest {
    @Test
    fun `immutable and mutable behave as expected`() {
        assertEquals(42, VariablesDemo.immutableValue)
        assertEquals(0, VariablesDemo.mutableValue)
        VariablesDemo.incrementMutable()
        assertEquals(1, VariablesDemo.mutableValue)
    }
}
