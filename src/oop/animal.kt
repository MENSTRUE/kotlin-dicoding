package oop

//    lateinit var name : String //-->

    val name : String by lazy {
    "contoh lazy"
    }

// "Lateinit & Lazy Property"

fun main() {

//    name = "rawr" //--> panjang string
//    println(name.length)

//    name = "rrrraawwrr"
//    if (:: name.isInitialized)
//        print(name.length)
//    else
//        print("bukan Initialized")

    println(name.length)
}