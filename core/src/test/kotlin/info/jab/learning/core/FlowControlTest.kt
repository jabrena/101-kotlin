package info.jab.learning.core

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlowControlTest {
    @Test
    fun `classify returns expected labels`() {
        assertEquals("negative", FlowControlDemo.classify(-1))
        assertEquals("zero", FlowControlDemo.classify(0))
        assertEquals("small", FlowControlDemo.classify(5))
        assertEquals("large", FlowControlDemo.classify(10))
    }

    @Test
    fun `max returns larger number`() {
        assertEquals(7, FlowControlDemo.max(7, 3))
        assertEquals(7, FlowControlDemo.max(4, 7))
    }
}
