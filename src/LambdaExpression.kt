fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val contohLambda : (String, String) -> String = { firstName: String, lastName: String ->
    val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Ary", "Setya")
    println(result)


    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Pambudi"))

    //menggunakan method reference dengan ::toUpper
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Ary Setya Pambudi"))

}