package oop

open class Data (
    val name: String,
    val semester: Int,
    val daerah: String,
    val umur: Int,
    val tahun_masuk: Int


) {

    open fun masuk() {
        println("$name masuk universitas pada tahun $tahun_masuk")
    }

    open fun tempat_tinggal(){
        println("$name tinggal di daerah $daerah")
    }


}

class mahasiswa(pName: String, pSemester: Int, pDaerah: String, pUmur: Int, pTahun_masuk: Int, val isAlumni: Boolean, val Nim: Int )
    : Data(pName, pSemester, pDaerah, pUmur, pTahun_masuk){

    override fun masuk() {
        println("$name masuk universitas pada tahun $tahun_masuk")
    }

    override fun tempat_tinggal(){
        println("$name tinggal di daerah $daerah")
    }

    fun Alumni(){
        println("$name apakah alumni? $isAlumni")
    }

    }

fun main() {
    val data_mahasiswa = mahasiswa("annisa", 4, "Yogyakarta", 20, 2023, false, 2023098)

    data_mahasiswa.masuk()
    data_mahasiswa.tempat_tinggal()
    data_mahasiswa.Alumni()
}