fun main()
{
    var user=User()

   var obj= with(user)
    {
        firstName="malik"
        lastName="Tayyab"
        age=19
        this
    }
    with(obj)
    {
        println(firstName)
        println(lastName)
        println(age)
    }
    
}

class User
{
    var firstName: String=" "
    var lastName: String=""
    var age: Int=0

}
