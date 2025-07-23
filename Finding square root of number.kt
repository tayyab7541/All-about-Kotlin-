import kotlin.math.sqrt
fun main(args: Array<String>) {
	print("Enter a number = ")
    val number = readLine()!!.toFloat()
    if(number>0.0&&number!=null)
    {
    var result= sqrt(number)
    println ("Square root of number = $result")
    }
    else
    {
    println ("Square root of negative number is not possible ")
    }
}
