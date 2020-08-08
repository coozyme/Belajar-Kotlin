

fun dua() {
    // error
    //  helloWorld()

}

fun tiga() {
    // error
    //  helloWorld()
}

//function helloworld hanya dapat digunakan pada scope itu saja, dan tidak bisa digunakan pada luar itu
fun main() {
    fun helloWorld() {
        println("Hello World")
    }

    helloWorld()
}