fun String.hello(): String = "Hello $this"
fun String.printlnHello(): Unit = println("Hai $this")

fun main() {
    var name = "Setya"

    println(name.hello())
    name.printlnHello()
    "Ary".printlnHello()
}