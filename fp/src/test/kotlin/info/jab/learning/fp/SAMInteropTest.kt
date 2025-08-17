package info.jab.learning.fp

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SAMInteropTest {
    @Test
    fun `countMatching uses SAM`() {
        val evens = SAMInteropDemo.countMatching(listOf(1,2,3,4,5,6)) { it % 2 == 0 }
        assertEquals(3, evens)
    }
}
