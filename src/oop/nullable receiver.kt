package oop

fun main() {
    // main contoh 1
    val value: Int? = null

    println(value.slice)

    // main contoh 2

    val jumlah: Int? = null
    val jumlah1: Int? = null

    println(jumlah?.percobaan)
    println(jumlah1?.percobaan)

    // main contoh 3

    val angka: Int? = null
    val angka1: Int? = null

    println(angka.coba)
    println(angka1.coba)
}



// contoh 1
val Int?.slice: Int
    get() = this?.div(2) ?: 0

//contoh 2
val Int.percobaan: Int
    get() = this.div(2)

// contoh 3 Kita juga bisa menentukan nilai dari receiver object jika bernilai null.
// Sehingga kita tidak perlu lagi menggunakan operator safe call ketika ingin memanggil extension tersebut.

val Int?.coba: Int
    get() = this?.div(2) ?: 0