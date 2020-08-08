fun main() {
    //IF
//    fun sayHello(name: String = ""): String {
//        if (name == ""){
//            return "Hello Wolrd"
//        } else {
//            return "Hai $name"
//        }
//    }


    //kita bisa mempersingkat dengan dibahah ini

//    fun sayHello(name: String = ""): String {
//        return if (name == ""){
//             "Hello Wolrd"
//        } else {
//             "Hai $name"
//        }
//    }

    //WHEN
//    fun sayHello(name: String=""):String{
//        when(name){
//            "" -> return "Hello When"
//        else -> return  "Hello $name"
//        }
//
//    }

    //Disin kita bisa mempersingkat syntak dengan
    fun sayHello(name: String=""):String{
        return when(name){
            "" ->  "Hello When"
            else ->  "Hello $name"
        }

    }


    println (sayHello())
    println (sayHello ("Ary"))

}