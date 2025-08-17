package info.jab.learning.fp

object ErrorHandlingDemo {
    fun divide(a: Int, b: Int): Result<Int> =
        if (b == 0) Result.failure(ArithmeticException("/ by zero")) else Result.success(a / b)

    sealed class Either<out L, out R> {
        data class Left<out L>(val value: L) : Either<L, Nothing>()
        data class Right<out R>(val value: R) : Either<Nothing, R>()
    }

    fun parseInt(s: String): Either<String, Int> =
        s.toIntOrNull()?.let { Either.Right(it) } ?: Either.Left("Not a number")
}
