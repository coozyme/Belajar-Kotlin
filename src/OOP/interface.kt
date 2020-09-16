package OOP

interface A {
    fun callMe(){
        println("dari interface A")
    }
}

interface B {
    fun callMe(){
        println("Dari interface B")
    }
}

class C : A,B {
    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }
}

fun main(){
    val obj = C()
    obj.callMe()
}