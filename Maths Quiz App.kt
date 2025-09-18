import org.w3c.dom.xpath.XPathResult

fun main()
{
    var ar1=(0..100).toList()
    var ar2=(0..200).toList()

    var r1=0
    var r2=0
    var marks=0

    for(i in 1..5)
    {
        r1=ar1.random()
        r2=ar2.random()
        print("$r1 + $r2 = ")
        var sum=readLine()!!.toInt()

        if(sum==r1+r2)
        {
            println("Correct")
            marks++
        }
        else
        {
            println("Incorrect")
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
