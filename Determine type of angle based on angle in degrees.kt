fun main() 
{
	var angle : Double= 0.0
    print("Enter angle in degrees = ")
     angle= readLine()!!.toDouble()
    if(angle==90.0)
    {
    println("It is a right angle " )
    }
    else if(angle>90.0)
    {
    println(" The angle is an obtuse angle ")
    }
    else 
    {
    println ("The angle is an acute angle")
    }
    
}
