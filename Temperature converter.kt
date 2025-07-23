fun main()
{
  print("Enter temperature to be converted = ")
  val temp = readLine()!!.toInt()
  print("Enterd temperature is in Celsius or Fahrenheit [f/C] = ")
  val scale= readLine()?.trim()?.firstOrNull()
  if(scale=='f'||scale=='F')
  {
   val cel= (5.0/9.0)*(temp - 32.0)
   println("Temperature in Celsius = $cel")
  }
  else 
  {
 val fah= (9.0/5.0)*(temp +32.0)
   println("Temperature in Celsius = $fah")
  }
}
