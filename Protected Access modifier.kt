fun main()
{
   
    var sec=Second()
    sec.display()

}

open class First
{
    protected var firstName:String=""
    protected var lastName: String=""

    fun input()
    {
        print("Enter your 1st name = ")
        firstName=readLine()!!.toString()
        print("Enter your 2nd name = ")
        lastName=readLine()!!.toString()
    }

}

class Second:First()
{
    fun display()
    {  input()
        println("Your name =  $firstName   $lastName ")
    }
}
