fun main()
{
var ar=arrayOf(5,4,9,1,3)
var s= ar.size
var temp:Int=0
for(i in 0..s-2)
{
for(j in 0..s-2)
{
if(ar[j]>ar[j+1])
{
temp=ar[j]
ar[j]=ar[j+1]
ar[j+1]=temp
}
}
}
for(i in 0..s)
{
println(ar[i])
}
}

