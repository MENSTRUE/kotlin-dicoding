fun main(args: Array<String>) {
//    val text : String? = null
//    text?.length

//    val text : String? = null
//    val textLength = text?.length ?: 7 ==> sama dibawah sini

    val text : String? = null
    val textLength = if (text != null) text.length else 7
    println(textLength)

//    val someText : String? = null
//    val someTextlength = someText!!.length
//    println(someTextlength) ==> eror


}