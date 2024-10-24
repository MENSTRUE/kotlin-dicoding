package oop

abstract class Players {
    // nilai default t idak diizinkan
    abstract val level: Int //must be overriden

    // nilai default diizinkan
    open val isUpgrade = true //optional to be overridden
    val isLevelUp = true //can not be overridden
}

interface IBuy {
    //default value not allowed
    val price: Int //must be overridden
    fun buy() //must be overridden
}

interface ISold {
}

class syaefur : Players(), IBuy, ISold {
    override val level: Int = 10    // this property must exist, try to remove it
    override val isUpgrade = true   // this property optional, try to remove it
    override val price = 10_000     // this property must exist, try to remove it
    override fun buy() {            // this method  must exist, try to remove it
        println("syaefur buy item")
    }
}

fun main() {
    val Syafur = syaefur()
    Syafur.buy()
}