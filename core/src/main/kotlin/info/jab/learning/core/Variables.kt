package info.jab.learning.core

object VariablesDemo {
    val immutableValue: Int = 42
    var mutableValue: Int = 0

    fun incrementMutable(): Int {
        mutableValue += 1
        return mutableValue
    }
}
