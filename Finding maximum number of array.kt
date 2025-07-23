fun main() 
{
	var ar = arrayOf(0,0,0,0,0)
    val size= ar.size
    for (i in 0..size-1)
    {
    print("Enter ${i+1} number = ")
    ar[i]= readLine()!!.toInt()
    }
    var max = ar[0]
    for(i in 0..size-1)
    {
    if(max<ar[i])
    {
    max=ar[i]
    }
    }
    println(" Maximum number of whole array = $max" )
    
     
}
