package dayfour.dataclass

data class UserData (val name : String){
    var age = 9
    fun printUser(){
        println(" Name = ${name.toUpperCase()} , umurnya : $age")
    }
}

fun main() {
    val namaku = UserData("Kharozim")
    namaku.printUser()
}