package info.jab.learning.core

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionsSequencesTest {
    @Test
    fun `immutableOps maps and filters`() {
        assertEquals(listOf(4, 6), CollectionsSequencesDemo.immutableOps())
    }

    @Test
    fun `mutableOps mutates list`() {
        assertEquals(listOf("b"), CollectionsSequencesDemo.mutableOps())
    }

    @Test
    fun `sequencePipeline squares and filters even`() {
        assertEquals(listOf(4, 16), CollectionsSequencesDemo.sequencePipeline())
    }
}
