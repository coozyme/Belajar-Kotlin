fun main() {
    fun hello (name: String, transformer: (String) -> String ): String  {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }

    var lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Ary", lambdaUpper))

    println(hello("Ary", {value: String -> value.toLowerCase()}))

    //Trailing Lambda ada 2 cara
    val result1 = hello("Setya",{value:String -> value.toLowerCase() })
    val result2 = hello("Setya") { value:String -> value.toLowerCase() }
}