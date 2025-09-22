fun main() 
{
    var c=Calculator<Int>()
    var op:Char?='a'
    var n1=0
    var n2=0
    
    print("Enter 1st number : ")
    n1=readLine()!!.toInt()
    print("Enter 2nd number : ")
    n2=readLine()!!.toInt()
    print("Enter operator :" )
    op=readLine()!!.single()
    if(op=='+')
    {
        c.add(n1,n2)
        }
        
  else if(op=='-')
    {
        c.sub(n1,n2)
        }
        
   else if(op=='/')
    {
        c.divide(n1,n2)
        }
else if(op=='*')
    {
        c.multiply(n1,n2)
        }
else if(op=='%')
    {
        c.modulus(n1,n2)
        }
        
        else
        {
            println("Invalid operator enterd ")
            }
    
    
}
class Calculator <T:Int>
{
    fun add(v1:T,v2:T)
    {
        println("$v1 + $v2 = ${v1+v2}")
        
    }
   
    fun sub(v1:T,v2:T)
    {
        println("$v1 - $v2 = ${v1-v2}")
        
    }
   
    fun divide(v1:T,v2:T)
    {
        println("$v1 / $v2 = ${v1/v2}")
        
    }
   
    fun multiply(v1:T,v2:T)
    {
        println("$v1 * $v2 = ${v1*v2}")
        
    }
   
    fun modulus(v1:T,v2:T)
    {
        println("$v1 % $v2 = ${v1%v2}")
        
    }
    }
