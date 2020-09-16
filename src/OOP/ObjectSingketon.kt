package OOP

import OOP.Test.hello

object Test {
    private var a = 1

    val b = 1

    fun hello(): Int {
        a = 12
        return a
    }
}

fun main() {
    val hasil : Int

    hasil = Test.hello()

    println("b = ${Test.b}")
    print("Hasil ${hasil}")
}