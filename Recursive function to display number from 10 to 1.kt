fun main(args: Array<String>) 
{
	dis(10)
}
fun dis(n:Int)
{
    if(n==0)
    {
    return 
    }
    else 
    {
        println("$n")
        dis(n-1)
        }
    }
