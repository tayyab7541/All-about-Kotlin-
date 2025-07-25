fun main() {
    
    var num1 :Double =0.0
    var num2 :Double = 0.0
    var num3 :Double =0.0
    print("Enter 1st number = ")
    num1= readLine()!!.toDouble()
    
     print("Enter 2nd number = ")
    num2= readLine()!!.toDouble()
    
     print("Enter 3rd number = ")
    num3= readLine()!!.toDouble()
    
    if(num1!=null&&num2!=null&&num3!=null)
    {
        if(num1>num2&&num1>num3)
        {
            println("Greatest of three numbers = $num1")
         }
        else if(num2>num1&&num2>num3)
        {
            println("Greatest of three numbers = $num2")
          }
        else 
        {
            println("Greatest of three numbers = $num3")
        }
     }
            }
