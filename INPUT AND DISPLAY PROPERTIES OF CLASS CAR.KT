fun main()
{
    var c=car()

    c.input()
    c.dis()
}

class car
{
    private var brand:String= " "
   private var model:Int=0
    private var relese_year:Int=0

    fun input()
    {
        print("Enter Brand Name of Car = ")
        brand=readLine()!!.toString()
        print("Enter Model = ")
        model=readLine()!!.toInt()
        print("Enter Release Year of your Car = ")
        relese_year=readLine()!!.toInt()
    }
    fun dis()
    {
        println("Brand = $brand \nModel = $model \nRelease Year = $relese_year ")
    }
}
