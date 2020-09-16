package Basic

fun main(){
    val daftar : Array<String> = arrayOf("sd","smp","sma")
    val daftar2 = arrayOf("smstr", 1, true, 4.0)

    //mengubah isi array dengan memasukan index ke brp, dan mau diganti apa
    daftar2.set(1,3)

    println(daftar[1])
    println(daftar2[2])
    //jumlah isi arrray
    println(daftar2.size)
}