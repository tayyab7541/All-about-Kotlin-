fun main()
{
    var ar=mutableListOf<Int>(1,2,3,4,5)
 var obj=P<Int>()
    obj.dis(ar)
}

class P<T>
{
    fun dis(ar: MutableList<T>)
    {
        var text= StringBuffer("This is generic display function to display list = ")
        println(ar.joinTo(text))
    }

}


