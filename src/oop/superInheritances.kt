package oop

open class Player(
    val name: String,
    val level: Int,
){
    open fun naikLevel(){
        println("$name anda pada level $level")
    }
}

class player1(pNama: String, pLevel: Int)
    : Player(pNama, pLevel){

    override fun naikLevel() {
        super.naikLevel()
    }

    }

fun main() {
    val sani = player1("sina", 20)
    sani.naikLevel()
}