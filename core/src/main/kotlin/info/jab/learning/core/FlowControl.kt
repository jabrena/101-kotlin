package info.jab.learning.core

object FlowControlDemo {
    fun classify(n: Int): String = when {
        n < 0 -> "negative"
        n == 0 -> "zero"
        n in 1..9 -> "small"
        else -> "large"
    }

    fun max(a: Int, b: Int): Int {
        val result = if (a > b) a else b
        return result
    }
}
