fun main() {
    val toko_buka = 7
    val toko_tutup = 21
    val jam_sekarang = 14

//    val buka = if (jam_sekarang >= toko_buka && jam_sekarang <= toko_tutup){ <== ini contoh AND
//        println("toko masih buka")
//    }else{
//        println("toko sudah tutup")
//    }
//    println("apakah toko buka? $buka")

//    val buka = if (jam_sekarang >= toko_buka || jam_sekarang <= toko_tutup){ <== ini contor OR
//        println("toko masih buka")
//    }else{
//        println("toko sudah tutup")
//    }
//    println("apakah toko buka? $buka")

    val buka = jam_sekarang > toko_buka
if (!buka){
    println("toko tutup")                                                   // <== not
}else {
    println("toko buka")
}

}