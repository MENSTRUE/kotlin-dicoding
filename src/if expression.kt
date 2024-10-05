fun main() {
    val nilai_mahasiswa_A = 80
    val mahasiswa_A = "mahasiswa A"
    val nilai_mahasiswa_B = 45
    val mahasiswa_B = "mahasiswa B"
    val rata_rata_minimal = 65
    val nilai_mahasiswa_C = 65
    val mahasiswa_C = "mahasiswa C"
    if (nilai_mahasiswa_A > rata_rata_minimal){
        println("$mahasiswa_A lulus")
    } else {
        println("$mahasiswa_A tidak lulus")
    }

    if (nilai_mahasiswa_B > rata_rata_minimal){
        println("$mahasiswa_B lulus")
    } else {
        println("$mahasiswa_B tidak lulus")
    }

    if (nilai_mahasiswa_C > rata_rata_minimal){
        println("$mahasiswa_C lulus")
    }else if (nilai_mahasiswa_C == rata_rata_minimal) {
        println("$mahasiswa_C cukup")
    }else{
        println("$mahasiswa_C tidak lulus")
    }
}
