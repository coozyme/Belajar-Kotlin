fun main() {
    //JIKA valuenya besar maka akan error misal kita kasih value 10000 maka kita bisa kasih tailrec agar tidak error
    tailrec fun display (value: Int){
        println("Recursive $value")
        if (value > 0){
            display(value - 1)
        }
    }

//    display(10)

    tailrec fun factorialTail(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else ->  factorialTail(value -1, total * value)
        }
    }

    println (factorialTail(12))
}