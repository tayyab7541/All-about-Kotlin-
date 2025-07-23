fun main()
{
var ar =arrayOf(0,0,0,0,0,0,0)
val s= ar.size
for(i in 0 until s)
{
print("Enter ${i+1} number = ")
    ar[i]= readLine()!!.toInt()
}
var sum=0
for(i in 0..s-1)
{
sum+=ar[i]
}
println("Sum of whole array = $sum ")
}
