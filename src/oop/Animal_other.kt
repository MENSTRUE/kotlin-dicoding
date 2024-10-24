package oop

class Animal_other {
//    var name : String = "harimau"

    var name :String = "Miaw"
    get(){
        println("fungsi getter terpanggil")
        return field
    }
    set(value) {
        println("fungsin setter terpanggil")
        field = value
    }

//    var name : String = null //--> diguanakan ketika null

//    lateinit var name : String

    var weight : Double = 4.5
    var age : Int = 4
    var isMamal : Boolean = true

    fun eat(){
        println("$name ayo makan!")
    }

    fun sleep(){
        println("$name ayo tidur !")
    }

}

fun main() {
    val dicoding = Animal_other()
    println("spesies : ${dicoding.name}, berat : ${dicoding.weight} umur : ${dicoding.age}, Mamalia : ${dicoding.isMamal}")
    dicoding.eat()
    dicoding.sleep()

    // mengubah properties dari class dicoding
    dicoding.name = "cheatah"
    dicoding.weight = 9.5
    dicoding.age = 4
    println("spesies : ${dicoding.name}, berat : ${dicoding.weight} umur : ${dicoding.age}, Mamalia : ${dicoding.isMamal}")
    dicoding.eat()
    dicoding.sleep()

    // property accessor
    val Dicoding = Animal_other()
    println("spesies : ${Dicoding.name}")
    Dicoding.name = "Goat"
    println("spesies : ${Dicoding.name}")
}