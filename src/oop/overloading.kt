package oop

class somebody (private var name: String){

    fun target(){
        println("target $name")
    }

    fun target(typeTarget : String){
        println("target $name yaitu $typeTarget")
    }

    fun target(typeTarget: String, berat : Double){
        println("target $name yaitu $typeTarget agar berat dia $berat ")
    }

    fun calories(){
        println("$name bakarlah kalori")
    }

}


fun main() {
    val someOne = somebody("Surya")

    someOne.target()
    someOne.target("menurunkan berat badan")
    someOne.target("menurunkan berat badan", 50.5)
}