fun main(args: Array<String>) 
{
 var ar = arrayOf(0,0,0,0,0)
 val size = ar.size
 for(i in 0..size-1 )
 {
 print("Enter ${i+1} number =")
 ar[i]= readLine()!!.toInt()
 }
 var min=ar[0]
 for(i in 0..size-1 )
  {
  if(min>ar[i])
  {
  min=ar[i]
  }
  }
  println("Minimum number from array = $min")
}
