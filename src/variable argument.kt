fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}
fun getNumberSize (vararg number: Int): Int{    // tidak boleh 2 kali vararg
    return number.size
}
fun sets (name: String, vararg number: Int){
return println("$name $number")
}
fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    val number1 = getNumberSize(10, 30, 50)
    println(number1)


    println(sets("anjay", 20, 30))
}

