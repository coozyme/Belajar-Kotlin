fun main() {
//    fun sayHello(name: String = ""): String {
//        if (name == ""){
//            return "Hello Wolrd"
//        } else {
//            return "Hai $name"
//        }
//    }

    //kita bisa mempersingkat dengan

    fun sayHello(name: String = ""): String {
        return if (name == ""){
             "Hello Wolrd"
        } else {
             "Hai $name"
        }
    }

    println (sayHello())
    println (sayHello ("Ary"))

}