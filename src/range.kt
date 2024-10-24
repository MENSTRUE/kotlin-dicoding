fun main() {
//    val panjangrange = 1..10
//    println(panjangrange.step)

    val panjangrange = 1..20 step 5
    panjangrange.forEach {
        println("$it")
    }
    println(panjangrange.step)

    val pengecekanNomor = 20.downTo(1)
    if (5 in pengecekanNomor){
        println("ini angka lima")
    }

    if (1<= 5 && 5 <= 20){
        println("nilai 5")
    }

    val perhitunganLain = 10. downTo(1)
    if (11 !in perhitunganLain){
        println("ngga ada angka 11")
    }

    val panjangChar = 'A'.rangeTo('H')
    println(panjangChar)




}