fun main() {
    var c = Circle()
    var r = Rectangle()

    c.input()
    c.area()
    r.input()
    r.area()
}
abstract open class Shape()
{
  abstract  open fun area()
}

class Circle():Shape()
{
    var radius=0.0
    fun input()
    {
        print("Enter Radius of corcle = ")
        radius=readLine()!!.toDouble()
    }

    override fun area() {
        println("The are of circle = ${3.14*radius*radius}")
    }
}
class Rectangle():Shape()
{
    var len=0
    var wid=0
    fun input()
    {
        print("Enter length = ")
        len=readLine()!!.toInt()
        print("Enter width of rectangle = ")
        wid=readLine()!!.toInt()
    }

    override fun area() {
        println("Area of rectangel =${len*wid} ")
    }

}
