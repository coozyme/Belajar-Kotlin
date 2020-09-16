package Basic

fun main(){
    var mem = arrayOf("a","b","c")

    for (a in mem){
        println(a)
    }
    //loop 1 -> 10
    for (a in 1..10 ){
        print(a)
    }
    println()
    //lompat lima angka
    for (a in 0..10 step 5){
        print(a)
    }
    println()
    //urutan 10 -> 1
    for (a in 10 downTo 1){
        print(a)
    }
    println()
    //mencetak isi array
    for (i in 0..mem.size - 1){
        print(i)
    }
    println()
    //cara mudah atau simple dibanding diatas
    for (i in mem.indices){
        print(i)
    }


}