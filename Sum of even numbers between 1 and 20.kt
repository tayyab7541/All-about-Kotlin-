fun main() 
{
	var num: Int = 1
    var num1 :Int = 20
    var sum : Int = 0
    for(i in num..num1)
    {
    if(i%2==0)
    {
    sum+= i
    }
    }
    
    println("sum is = $sum")
}
