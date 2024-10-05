fun main(args: Array<String>) {
    var string : String? = "bezirr"
    if (string != null){
        println(string.length)
    }
var obj : Any = "Anjayy"
    if (obj is String){
        println("string length is ${obj.length}")
    }
}