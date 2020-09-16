package OOP

abstract class AbstrakClass (namaHero: String){
    init {
        println("nama Hero : $namaHero")
    }

    fun defense(deff: Int){
        println("Deffense : $deff")
    }

    fun attack(attk: Int){
        println("Attack : $attk")
    }

    fun metta(mt: String){
        println("meta : $mt")
    }

    abstract fun tampilkan(keterangan : String)
}

class Hero(nama: String) : AbstrakClass(nama){
    override fun tampilkan(keterangan: String) {
        println(keterangan)
    }

}

fun main() {

    val argus = Hero("Argus")
    argus.defense(100)
    argus.attack(90)
    argus.metta("Attacker")
    argus.tampilkan("Hero paling mantep")

    val zilong = Hero("Zilong")
    argus.defense(80)
    argus.attack(80)
    argus.metta("Assasint")
    argus.tampilkan("Hero paling Support")

}