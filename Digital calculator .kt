fun main(args: Array<String>) 
{

  var num1 : Double =0.0
  var num2 :Double=0.0
  var op:Int=0
  print("Enter 1st number =")
  num1=readLine()!!. toDouble ()
  print ("Enter 2nd number =")
  num2=readLine()!!. toDouble ()
  println ("1: For addition")
  println ("2: For subtraction ")
  println ("3: For multiplication ")
  println ("4:For division ")
  
  print ("Enter your choice =")
  op=readLine()!!.toInt()
  when(op)
  {
  1 ->
  {
  println (" $num1 + $num2 = ${num1 + num2}")
  }
  2 ->
  {
  println ("$num1 - $num2 = ${num1 - num2} ")
  }
  3 ->
  {
  println("$num1*$num2 = ${num1*num2}")
  }
  4 ->
  {
  println ("$num1 / $num2 = ${num1/num2}")
  }
  else ->
  {
  println ("You enter invalid number ")
  }
  }
}
