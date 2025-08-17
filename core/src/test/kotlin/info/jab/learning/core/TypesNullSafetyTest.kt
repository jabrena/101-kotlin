package info.jab.learning.core

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TypesNullSafetyTest {
    @Test
    fun `safe call returns null for null input`() {
        assertNull(TypesNullSafetyDemo.lengthOrNull(null))
        assertEquals(4, TypesNullSafetyDemo.lengthOrNull("test"))
    }

    @Test
    fun `lateinit and lazy work`() {
        TypesNullSafetyDemo.lateInitValue = "ready"
        assertEquals("ready", TypesNullSafetyDemo.lateInitValue)
        assertEquals("computed", TypesNullSafetyDemo.lazyValue)
    }
}
