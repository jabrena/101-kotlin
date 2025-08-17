package info.jab.learning.fp

fun Int.double(): Int = this * 2

object FunctionsAndLambdas {
    fun applyTwice(n: Int, f: (Int) -> Int): Int = f(f(n))

    inline fun <T> benchmark(block: () -> T): T {
        return block()
    }
}
