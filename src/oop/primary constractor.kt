package oop



fun main() {

val WolfRawr = animal ("serigala", 10.5, 5, true )
    println("nama : ${WolfRawr.name}, berat : ${WolfRawr.weight}, umur : ${WolfRawr.age}, mamalia : ${WolfRawr.isMammal}")

val tambah_properti = animal ("anjing", 7.5, 2, isMammal = false)
    println("nama : ${tambah_properti.name}, berat : ${tambah_properti.weight}, umur : ${tambah_properti.age}, mamalia : ${tambah_properti.isMammal} ")

    val miaw = Animal1("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${miaw.name}, Berat: ${miaw.weight}, Umur: ${miaw.age}, mamalia: ${miaw.isMammal}")


}

//class animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) // mungkin di taruh dibawah !!!
class animal(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true) // untuk membuat nilai default

// kelas berisi init
//class Animal1 (pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){   //==> tanpa menggunakan "this"
//    val name: String
//    val weight: Double
//    val age: Int
//    val isMammal: Boolean
//
//    init {
//        weight = if(pWeight < 0) 0.1 else pWeight
//        age = if(pAge < 0) 0 else pAge
//        name = pName
//        isMammal = pIsMammal
//    }
//}

class Animal1(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}