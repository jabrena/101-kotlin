package info.jab.learning.fp

import arrow.core.*
import arrow.core.raise.either
import arrow.core.raise.ensure

object ArrowCoreExamples {
    fun optionExample(input: String?): Option<Int> = input?.length?.let { Some(it) } ?: None

    fun eitherExample(input: String): Either<String, Int> = input.toIntOrNull()?.right() ?: "NaN".left()

    fun validatedExample(values: List<Int>): Validated<NonEmptyList<String>, List<Int>> =
        if (values.all { it >= 0 }) Validated.Valid(values)
        else Validated.Invalid(NonEmptyList("Negative value", emptyList()))

    fun nonEmptyListExample(head: Int, tail: List<Int>): NonEmptyList<Int> = NonEmptyList(head, tail)

    fun raiseEitherExample(nStr: String, dStr: String): Either<String, Int> =
        either<String, Int> {
            val n = nStr.toIntOrNull() ?: raise("NaN")
            val d = dStr.toIntOrNull() ?: raise("NaN")
            ensure(d != 0) { "Div by zero" }
            n / d
        }
}
