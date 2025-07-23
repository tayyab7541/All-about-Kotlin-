fun main(args: Array<String>) {
	println("Enter number of years for which money is left in bank = ")
    val numYear= readLine()!!.toInt()
    if(numYear>=5)
    {
     val interest= 4.5
    println("Interest rate =$interest%")
    }
    else if(numYear>0)
    {
    val interest = 3.0
    println ("Interest rate = $interest %")
    }
    else
    {
    println ("Entered period is invalid ")
    }
}
