fun main()
{
    var ar1=(1..100).toList()
    var ar2=(1..200).toList()
    var ar=listOf('+','-','*','/','%')
    var r1=0
    var r2=0
    var operator: Char? = 'o'
    var marks=0
  println("All calculations are done with integer so ,be carefull dont give answer in decimal give only 1st digits before decimal")
    for(i in 1..5)
    {
        r1=ar1.random()
        r2=ar2.random()
        operator=ar.random()
        print("$r1  $operator $r2 = ")
        var answer=readLine()!!.toInt()
         if(operator=='+')
         {
             if (answer == r1 + r2) {
                 println("Correct")
                 marks++
             } else {
                 println("Incorrect")
             }
         }
       else if(operator=='-')
        {
            if (answer == r1 - r2)
            {
                println("Correct")
                marks++
            } else
            {
                println("Incorrect")
                
            }
        }
        else if(operator=='*')
        {
            if (answer == r1 * r2)
            {
                println("Correct")
                marks++
            }
            else
            {
                println("Incorrect")
            }
        }
       else if(operator=='/')
        {
            if (answer== r1 / r2)
            {
                println("Correct")
                marks++
            }
            else
            {
                println("Incorrect")
            }
        }
      else if(operator=='%')
        {
            if (answer== r1 % r2)
            {
                println("Correct")
                marks++
            }
            else
            {
                println("Incorrect")
            }
        }
    }

    println("Total marks = $marks")
    var percent=(marks/5.0)*100.0
    println("Your percentage = ${percent}")
    if(percent>=80.0&&percent<=100.0)
    {
        println("YOur Grade = A")
    }
    else if(percent>=70.0&&percent<=80.0)
    {
        println("YOur Grade = B")
    }
    else if(percent>=60.0&&percent<=70.0)
    {
        println("Your Grade = C")
    }
    else if(percent>=50.0)
    {
        println("Your Grade= D")
    }
    else if(percent<50.0)
    {
        println("Your Grade = F ")
    }



}
