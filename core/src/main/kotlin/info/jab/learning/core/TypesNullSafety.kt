package info.jab.learning.core

object TypesNullSafetyDemo {
    fun lengthOrNull(s: String?): Int? = s?.length

    lateinit var lateInitValue: String

    val lazyValue: String by lazy { "computed" }
}
