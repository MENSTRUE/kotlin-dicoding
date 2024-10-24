import kotlin.random.Random

fun main() {
//    val value = 2
    val value = 20


val when_expression =    when (value){
//        1 -> println("isinya 1")
//        2 -> println("isinya 2")
//        3 -> println("isinya 3")
//        else -> println("kau pilih apa?")

    1 -> {
        println("angka 1")
        "anda memilih angka 1"
    }

    2 -> {
        println("angka 2")
        "anda memilih angka 2"
    }

    3 -> {
        println("angka 3")
        "anda memilih angka 3"
    }

    else -> {
        println("eror")
        "sistem eror"
    }

    }
    println(when_expression)

    val anyType : Any = 100
    when(anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a integer type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    val isi =  27
    val panjang = 10..50

    when(isi){
        in panjang -> println("isi ada dalam panjang")
        !in panjang -> println("isi diluar panjang")
    }

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    var a = 10

    when (a) {
        a+a -> println("ok")

    }

}

fun getRegisterNumber() = Random.nextInt(100)


