package OOP

//Getter dapat digunakan u/ mengambil nilai dalam properti
//Setter dapat digunakan u/ memberikan nilai pada properti


fun main() {
    val p = People()
    p.NAMA = "ARY"
    println("${p.NAMA}")
}

class People{
    var NAMA: String  = "Default value"
    get()=field
    set(value) {
        field  = value
    }
}

