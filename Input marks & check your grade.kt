fun main() 
{
    var marks :Double =0.0
    print("Enter your marks = ")
    marks=readLine()!!.toDouble()
    if(marks>=0.0&&marks<=100.0)
{
    
    if(marks>=80.0&&marks<=100.0)
    {
        println("Your Grade = A")
     }
    else if(marks>=70.0&&marks<80.0)
    {
        println("Your Grade = B")
     }
    else if(marks>=60.0&&marks<70.0)
    {
        println("Your Grade = C")
     }
    else if(marks<60.0)
    {
        println("Your Grade = F ")
     }
}
else
    {
        println("You entered invalid marks ")
    }
}
