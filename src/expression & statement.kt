

fun main() {
    val minimal_nilai = 80
    val nilai_putri = 70
    val nilai_zahra = 85
    val value1 = 30
    val value2 = 20

    val keputusan_nilai = if (nilai_zahra>minimal_nilai) "ananda telah lulus" else "ananda tidak lulus"
    println(keputusan_nilai)    //expression

    if (nilai_putri>minimal_nilai){
        println("ananda telah lulus") //statement
    }else{
        println("ananda tidak lulus")
    }

    println(penjumlahan(1,4 * 5)) //expression
    println(penjumlahan(value1,value2)) //statement
}

fun penjumlahan (value1: Int, value2: Int) = value1 + value2