fun main(args: Array<String>) 
{
    val c=car()
    c.name="Mehran"
    c.model="Heavy"
    c.color="Blue"
    c.dis()
	
}

class car 
{
    var name=""
    var model = ""
    var color=""
    fun dis()
    {
      println("Name : $name \n Model : $model \n  Color : $color")  
        }
}
