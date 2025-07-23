fun main(args: Array<String>)
 {
   var salary :Double=0.0
   var workHours:Double=0.0
   print ("Enter number of hours worked in a week = ")
   workHours= readLine()!!. toDouble()
   if(workHours>0&&workHours<=40)
   {
    salary =workHours*12 +48
   println("Salary is = ${salary}$")
   }
   else if(workHours<0)
   {
   println ("Invalid number of hours entered ")
   }
   else
   {
   salary = workHours*18+48
   println("Salary is = $salary $")
   }
}
