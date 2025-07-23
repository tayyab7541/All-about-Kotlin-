fun main(args: Array<String>)
{
 var status : Char? = 'a'
 val seniorSalary=800
 val juniorSalary= 500
 print("Enter status of employee [s/J] = " )
 status= readLine()?.trim()?.getOrNull(0)
 if(status=='s'||status=='S')
 {
 println("Salary of senior person is = $seniorSalary $")
 }
 else if(status=='j'||status=='J')
 {
 println ("Junior person's salary= $juniorSalary $")
 }
 else
 {
 println ("Invalid input")
 
 }
}
