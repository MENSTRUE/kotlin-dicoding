import java.net.Proxy.Type

fun main() {
//    fun setUSer(name: String ,umur: Int,) : String{
//        return "dengan bapak/ibu $name, dan umur $umur"
//    }

    fun setUSer(name: String ,umur: Int,) = "dengan bapak/ibu $name, dan umur $umur"
    val user = setUSer("zahra", 19)
    println(user)

    fun printUser(name : String) : Unit {
        println("your name is $name")
    }
    val user1 = printUser("saipul")
    println(user1)

}