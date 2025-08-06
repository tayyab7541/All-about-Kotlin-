fun main(args: Array<String>) 
{
    var num=0
    print("Enter number to find factorial = ")
    num= readLine()!!.toInt()
    var result= factorial(num)
    println("Factorial of given number = $result")
}

fun factorial(number:Int):Int
{
    if(number==0)
    {
        return 1
    }
    else if(number >0)
    {
        return number * factorial(number-1)
     }
     else
     {
         return number * factorial(number+1)
       }
    }
