fun hitungTotal1(values: Array<Int>): Int {
    var total = 0

    for (value in values){
        total += value
    }
    return total;
}
//jika menggunakan vararg maka menjadi seperti ini, posisi vararg harus selalu di akhir

fun hitungTotal(name: String, vararg values: Int ): Int {
    var total = 0

    for (value in values){
        total += value
    }
    return total;
}

fun main() {
    val values = arrayOf(10,10,10,10)
    val result =    hitungTotal1(values)

//    val result = hitungTotal("ary", 10,10,10)
//    val result = hitungTotal1()

    println(result)
}