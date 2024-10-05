//fun sets(number: Array<Int>){
//}

//fun main() {
//    val number = arrayOf(15, 30, 45, 60)
//    println("${sets(number)}")
//
//}

fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number , 10)
    println(number)
}

fun sets(vararg number: Int): Int {
    return number.size
}