fun main(args: Array<String>)
{
    var car1 = car("Mehran", 2020,"Black")
    car1.dis()
}

class car(n:String,m:Int,c:String)
{
    var name = n
    var model= m
    var color = c
    fun dis()
    {
        println("Name = $name \nModel = $model \nColor = $color")
        }
    }
