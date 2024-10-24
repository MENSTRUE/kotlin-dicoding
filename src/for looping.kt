fun main() {
    val panjang = 1..19
    for (i in panjang){
        println("nomer $i")
    }

    // atau juga bisa

    val panjang1 = 1.rangeTo(10)
    for (i in panjang1){
        println("no.$i")
    }

    // step --> ditambakan ...

    val panjang2 = 1.rangeTo(15) step 5
    for (i in panjang2){
        println("kelipatan $i")
    }

    val ranges = 1.rangeTo(15) step 3
    for ((index, value) in ranges.withIndex() ){
        println(" jumlah $value dengan nilai index $index")
    }

    val range = 1.rangeTo(15 ) step 2
    range.forEach { value ->
        println("jumlah adalah $value")
    }

    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }


}