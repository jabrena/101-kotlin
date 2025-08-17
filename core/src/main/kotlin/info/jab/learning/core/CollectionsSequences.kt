package info.jab.learning.core

object CollectionsSequencesDemo {
    fun immutableOps(): List<Int> = listOf(1, 2, 3).map { it * 2 }.filter { it > 2 }

    fun mutableOps(): MutableList<String> {
        val items = mutableListOf("a")
        items += "b"
        items.remove("a")
        return items
    }

    fun sequencePipeline(): List<Int> = sequence {
        yieldAll(1..5)
    }.map { it * it }
        .filter { it % 2 == 0 }
        .toList()
}
