fun main()
{
    var found=false
    var ar=(1..15).toList()
    var num=0
    print("Enter number to seach = ")
    num=readLine()!!.toInt()
    var s=ar.size
    for(i in 0..s)
    { if (ar[i]==num)
    {
        println("$num is present in list ")
        found=true
        break
    }
    }
     if(!found)
     {
         println("soryy number could not be found ")
     }
}
