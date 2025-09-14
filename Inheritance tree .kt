
fun main()
{
    var emp=Employee("Fahad",20000)
    var man=Manager("Malik",20000)
    var dir=Director("Tayyab",20000)
    emp.salary()
    man.salary()
    dir.salary()
}
open class Employee(name: String, pay: Int)
{
    var name=name
    var basicPay=pay
    open fun salary()
    {
        println("Salary of $name is $basicPay")
    }
}

open class Manager(name: String,pay: Int):Employee(name,pay)
{

    override fun salary() {
        basicPay+=(basicPay*20)/100

        println("Salary of $name is $basicPay")
    }
}

class Director(name: String,pay: Int): Manager(name,pay)
{
    override fun salary() {

        basicPay+=(basicPay*50)/100
        println("Salary of $name is $basicPay")
    }
}
