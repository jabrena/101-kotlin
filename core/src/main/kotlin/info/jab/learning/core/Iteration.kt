package info.jab.learning.core

object IterationDemo {
    fun sumRange(n: Int): Int {
        var acc = 0
        for (i in 1..n) acc += i
        return acc
    }

    fun repeatTimes(times: Int): String {
        var s = ""
        repeat(times) { s += "*" }
        return s
    }
}
