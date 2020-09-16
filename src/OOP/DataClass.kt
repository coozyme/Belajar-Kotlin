package OOP

data class User(val nama: String, val age: Int )
data class Pengguna(val nama: String, val age: Int, val kelamin:String )

fun main(){
    //copying
    val u1 = User("Ary", 19)
    val u2 = User("Malik", 12)

    println("u1 : Nama: ${u1.nama}, Umur : ${u1 .age}")
    println("u2 : Nama: ${u2.nama}, Umur : ${u2 .age}")


    println("")
    //Mendeklrasaikan  Destruktring
    val u3 = Pengguna("Dia", 14,"Laki - laki")
    val (nama,umur,gender) = u3
    println("Nama = $nama")
    println("Umur = $umur")
    println("Gender = $gender")

    println("")

    println(u3.nama)
    println(u3.age)
    println(u3.kelamin)


}