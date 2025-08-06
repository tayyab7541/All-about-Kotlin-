fun main(args: Array<String>) 
{
    var n1=0
    var n2=0
    var n3=0
    print("Enter 1st number = ")
    n1= readLine()!!.toInt()
    print("Enter 2nd number = ")
	n2=readLine()!!.toInt()
    n3=sum(n1,n2)
    println("Sum of number = $n3")
}

fun sum(num:Int,num1:Int):Int
{
    if(num1==0)
    {
        return num
     }
     else if(num1>0)
     {
         return  sum(num+1,num1-1)
     }
     else
     {
        return  sum(num-1,num1+1)
       }
    }
