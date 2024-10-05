
    fun getFullName (firstName : String, middleName : String, lastName : String) : String{   // boleh dibalik !
        return "nama lengkap saya adalah $firstName $middleName $lastName"
    }

    fun getFullName2 (firstName: String = "saipul", middleName: String = "al", lastName: String = "badri"): String{
        return "$firstName $middleName $lastName"
    }

    fun main() {
        val fullname = getFullName(firstName = "wafa", middleName = "bila", lastName = "syaefurokhman")
        println(fullname)

        val percobaan = getFullName2(firstName = "vica")
        println(percobaan)
    }
