fun main(args: Array<String>) 
{
    var angle:Double=0.0
	println("enter angle=")
    angle=readLine()!!.toDouble()
    
    do
    {
    if(angle>360)
    {
    angle-=360
    }
    }while(angle>360)
    
   while(angle<0)
   {
    angle +=360
    }
    
    
    if(angle==0.0||angle==90.0||angle==180.0||angle==270.0||angle==360.0)
    {
    println(" Corresponding line is not any Quadrent ")
    }
    else if(angle>0.0&&angle<90.0)
    {
    println ("Line is in 1st quadrent")
    }
   else if(angle>90.0&&angle<180.0)
    {
    println("Line is in 2nd quadrent ")
    }
    else if(angle>180.0&&angle<270.0)
    {
    println("Line is in 3rd quadrent ")
    }
    else if(angle>270.0&&angle<360.0)
    {
    println("Line is in 4th quadrent ")
    }
}
