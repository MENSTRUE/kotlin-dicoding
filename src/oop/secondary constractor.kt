package oop

class data_mahasiswa (nama : String, semester : Int, umur : Int){
    val nama : String
    val semester : Int
    val umur : Int
    var isActive : Boolean

    init {
        this.nama = nama
        this.semester = semester
        this.umur = if (umur < 0) 0 else umur
        this.isActive = true
    }

    constructor (nama: String, semester: Int, umur: Int, isActive: Boolean) : this(nama,semester,umur){
        this.isActive = isActive
    }
}

fun main() {
    val mahasiswa_A = data_mahasiswa("yanto", 3, 19, true)
    println("nama : ${mahasiswa_A.nama}, semester : ${mahasiswa_A.semester} umur : ${mahasiswa_A.umur}, status : ${mahasiswa_A.isActive}")

    val mahasiswa_B = data_mahasiswa("yanto", 3, 19)
    println("nama : ${mahasiswa_B.nama}, semester : ${mahasiswa_B.semester} umur : ${mahasiswa_B.umur}, status : ${mahasiswa_B.isActive}")
}


//class Animal2(name: String, weight: Double, age: Int) {
//    val name: String
//    val weight: Double
//    val age: Int
//    var isMammal: Boolean
//
//    init {
//        this.weight = if(weight < 0) 0.1 else weight
//        this.age = if(age < 0) 0  else age
//        this.name = name
//        this.isMammal = false
//    }
//
//    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
//        this.isMammal = isMammal
//    }
//}
//
//fun main() {
//    val dicodingCat = Animal2("Dicoding Miaw", 2.5, 2, true)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
//
//    val dicodingBird = Animal2("Dicoding tweet", 0.5, 1)
//    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
//}
