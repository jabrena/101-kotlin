package info.jab.learning.fp

fun interface IntPredicate {
    fun test(value: Int): Boolean
}

object SAMInteropDemo {
    fun countMatching(values: List<Int>, predicate: IntPredicate): Int =
        values.count { predicate.test(it) }
}
