package OOP

class Outer (){
    val a = "Diluar dari nested class"

    inner class Inner {
        fun callMe() = a
    }
}

fun main(){
    val outer = Outer()
    println("Menggunakan Objek outer: ${outer.Inner().callMe()}")

    val inner = Outer().Inner()
    println("Menggunakan Objek inner: ${inner.callMe()}")
}