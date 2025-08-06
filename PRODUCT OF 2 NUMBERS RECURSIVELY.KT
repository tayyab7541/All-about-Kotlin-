fun main(args: Array<String>) 
{
	var n1=0
    var n2=0
    var n3=0
    print("Enter 1st number = ")
    n1= readLine()!!.toInt()
    print("Enter 2nd number = ")
    n2= readLine()!!.toInt()
    n3= product(n1,n2)
    println("Product of numbers = $n3")
}

fun product(n1:Int,n2:Int):Int
{
    if(n2==1)
    {
        return n1
    }
    else if(n1==1)
   {
            return n2
    }
   else if(n1==0||n2==0)
    {
        return 0
     }
     
     else if(n1>0&&n2>0)
     {
         return n1+product(n1,n2-1)
     }
    else
    {
        if(n1<0&&n2>0)
        {
            return n1+product(n1,n2-1)
        }
        else if(n2<0&&n1>0)
        {
            return -n1+ product(n1,n2+1)
        }
        else 
        {
            return -n1+ product(n1,n2+1)
        }
        
     }
    }
