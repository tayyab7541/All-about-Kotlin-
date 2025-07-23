fun main()
{
var num:Int = 6
var loc=0
var ar= arrayOf (1,4,7,6,9,0)
var found:Boolean = false
var s=ar.size
for(i in 0..s)
{
if(num==ar[i])
{
found=true
loc=i+1
break 
}
}
if(found)
{
println("number is found at location $loc")
}
else
{
println("The number is not found")
}
}

