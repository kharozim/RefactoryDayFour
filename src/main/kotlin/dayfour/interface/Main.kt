package dayfour.`interface`

interface RepoUser {
    val name :String
    fun getAlluser()
}

class DBUserRepo : RepoUser{
    override val name: String get() = "user from db"
    override fun getAlluser() {}
    //sqlite
}

class DBClientRepo : RepoUser {
    override val name: String get() = "User from server"
    override fun getAlluser() {}
    //retrofit
}

fun main() {


}