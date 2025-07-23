fun main ()
{
var num1 :Double = 0.0
var num2 : Double = 0.0
var op : Char? = null 
print("Enter 1st number = ")
num1 = readLine()!!.toDouble()
print("Enter 2nd number = ")
num2 = readLine ()!!.toDouble()
print("Enter operator = ")
op= readLine()?.trim()?.getOrNull(0)
when(op)
{
'+' -> 
{
print("Sum  = ${num1+num2}")
}
'-' ->
{
print("Difference = ${num1-num2}")
}
'*' ->
{
print("Product = ${num1*num2}")
}
'/' ->
{
if(num2==0.0)
{
println ("Division by zero not possible ")
}
else 
{
print("Division = ${num1/num2}")
}
}
else ->
{
println("Invalid operator ")
}

}
}
