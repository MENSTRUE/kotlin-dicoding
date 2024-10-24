package oop

fun main() {
    // ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol.
    val nilai = 9
    println(nilai / 0)

    // NumberFormatException disebabkan karena terjadi kesalahan dalam format angka.
    val string_nilai = "10.0"
    println(string_nilai.toInt())

    //NullPointerException atau NPE. Walaupun Kotlin memiliki operator Null Safety, NPE tetap bisa saja terjadi.
    // NPE terjadi karena sebuah variabel atau objek memiliki nilai null,
    // padahal seharusnya objek atau variabel tersebut tidak boleh null.
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}