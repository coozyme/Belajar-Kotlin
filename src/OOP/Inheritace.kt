package OOP

open class Personal(name: String, age: Int) {
    init {
        println("Nama saya ${name}")
        println("Umur saya ${age}")
    }
}

class Guru(name:String, Age:Int) : Personal(name,Age) {
    fun mengajar(){
        println("Saya pengajar")
    }
}

class Player(name:String, Age:Int) : Personal(name,Age) {
    fun pemainBola(){
        println("Saya pemain Bola")
    }
}

class Penonton(name:String, Age:Int) : Personal(name,Age) {
    fun see(){
        println("Saya Penonton")
    }
}

fun main(){
    val t1 = Guru("ary", 19)
    t1.mengajar()
    println()
    val t2 = Player("Malik", 12)
    t2.pemainBola()
    println()
    val t3 = Penonton("Bapak", 90)
    t3.see()
    

}