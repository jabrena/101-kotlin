package info.jab.learning.core

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IterationTest {
    @Test
    fun `sumRange sums numbers`() {
        assertEquals(6, IterationDemo.sumRange(3))
        assertEquals(55, IterationDemo.sumRange(10))
    }

    @Test
    fun `repeatTimes repeats character`() {
        assertEquals("***", IterationDemo.repeatTimes(3))
        assertEquals("", IterationDemo.repeatTimes(0))
    }
}
