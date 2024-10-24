package oop

fun main() {
    100.printInt()
    println(100.Plus())
    println(9.pembagian)
    println(result)
    println()
}
// extension functions  ==> untuk menambahkan function baru
fun Int.printInt(){
    println("isinya $this")
}

fun Int.Plus():Int{
    return this + 10
}

// extension properties

val Int.pembagian: Int
    get() = this / this

//infix function
infix fun Int.sum(value: Int): Int{
    return this + value
}

val result = 10.sum(100)

// contoh lain infix

class villain {
    infix fun addVillain(t : String) {/*...*/}

    fun build(){
        this.addVillain ("turbo")
        addVillain("tarno")
    }

    val hasil_villain = build()

}