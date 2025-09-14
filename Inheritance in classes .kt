fun main()
{
    var d=Dog("Dog","Bao Bao ")
    var c=Cat("Bili","Mao Mao ")

    d.makeSound()
    c.makeSound()
}

open class Animal(name: String,sound: String)
{
    var name=name

    var sound=sound

    open fun makeSound()
    {}
}

class Dog(name: String,sound: String):Animal(name,sound)
{
    override fun makeSound() {
        println("$name makes sound of $sound")
    }
}
class Cat(name: String,sound: String):Animal(name,sound)
{
    override fun makeSound() {
        println("$name makes sound of $sound")
    }
}
