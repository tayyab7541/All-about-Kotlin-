fun main()
{
   var user = User().apply{  //apply function return the whole object on which it is called
       firstName="Malik"
       lastName="Tayyab"
       age=19
   }

    with(user) //to display values 
    {
        println(firstName)
        println(lastName)
        println(age)

    }

}

class User
{
    var firstName: String=""
    var lastName: String=""
    var age: Int=0
}
