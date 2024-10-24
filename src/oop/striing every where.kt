package oop

fun main() {
    val String = "somestring"
    println(String.reversed())
    println(String.uppercase())
    println(String.lowercase())

    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)




}