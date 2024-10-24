fun main() {
    val angka = listOf(10, 20, 30, null, 40, null, "zahra")
    for (i in angka){
        println(i)
    }

    val listOfInt = listOf("wafa", "bila", 10, 2005, null, "sekar")
    for (i in listOfInt){
        if (i == null) continue
        println(i)
    }

    val angkaListOf = listOf("magic", "mahou", 10, null, 80, null, 60)
    for (i in angkaListOf){
        if (i == null) break
        println(i)
    }

    loop@ for (i in 1..19){
        println("luaran pengulang")

        for (j in 1..30){
            println("dalam pengulangan")
            if (j > 19) break@loop
        }
    }
}