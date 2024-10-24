package oop

/*public
==> Properti tersebut dapat kita akses dari luar kelas
*/

/* private
==> Dengan menggunakan hak akses private, maka kita tidak diizinkan untuk mengakses properti pada kelas tersebut  dari luar kelasnya.
 */

//example

class data_Siswa (
    private var nama: String,
    private val kelas: Int,
    private val abjad_kelas: String,
    private val umur : Int,
    private val berat : Double,
    private val isActive : Boolean
) {

    fun getName(): String {
        return nama
    }

    fun setName(newNama: String) {
        nama = newNama
    }
}

// proteted

open class data_Guru (val nama : String, protected val kode_guru : String)
class Agus (pNama : String, pKode_Guru : String) : data_Guru(pNama,pKode_Guru)

// internal
internal class Aqua(val nama_produk : String)
fun main() {
    val Ara = data_Siswa("zahra", 4, "c", 12, 30.5, true)
//    println("nama = $Ara.") //==> dengan cara ini tidak bisa !!
    println(Ara.getName())
    Ara.setName("Annisa")
    println(Ara.getName())

    val agus = Agus("Agus susilo", "A234")
    println("nama : ${agus.nama}")
//    println("kode guru : $agus.")  //==> tidak bisa double !!, error: expecting a top level declaration

    val minum = Aqua("le mineral")
    println("masa beli ${minum.nama_produk}")
}