package info.jab.learning.fp

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OOPKotlinWayTest {
    @Test
    fun `data classes and sealed interfaces`() {
        val s1: Shape = Circle(2.0)
        val s2: Shape = Rectangle(2.0, 3.0)
        assertEquals(Math.PI * 4.0, s1.area(), 1e-9)
        assertEquals(6.0, s2.area(), 1e-9)
    }

    @Test
    fun `singleton and companion`() {
        assertEquals("singleton", Singletons.instance)
        val c = Counter.startAt(10).inc().inc()
        assertEquals(12, c.get())
    }
}
