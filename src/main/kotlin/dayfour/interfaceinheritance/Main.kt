package dayfour.interfaceinheritance

interface Product {
    val name : String

}

interface FoodProduct : Product{
    val expiredAt : String
}

class Tv : Product{
    override val name: String
        get() = "Television"

}
class  Bread : FoodProduct {
    override val expiredAt: String
        get() = "2020"
    override val name: String = "Bread"

}

fun main() {
    val television : Product = Tv()
    val bread : FoodProduct = Bread()

    println(television.name)
    println(bread.name)
    println(bread.expiredAt)
}