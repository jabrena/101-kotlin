package info.jab.learning.fp

data class User(val id: Int, val name: String)

sealed interface Shape {
    fun area(): Double
}

data class Circle(val r: Double) : Shape { override fun area(): Double = Math.PI * r * r }

data class Rectangle(val w: Double, val h: Double) : Shape { override fun area(): Double = w * h }

object Singletons { val instance: String = "singleton" }

class Counter(private var value: Int = 0) {
    companion object { fun startAt(n: Int) = Counter(n) }
    fun inc(): Counter { value += 1; return this }
    fun get(): Int = value
}
