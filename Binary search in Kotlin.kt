fun main ()
{
    var ar=(1..30).toList()
    var num=0
    print("Enter number to seach = ")
    num=readLine()!!.toInt()
    var mid=0
    var found=false
    var i=0;
    var n=ar.size-1
    while(i<=n)
    {
        mid=(i+n)/2
        if(num>ar[mid])
        {
            i=mid+1
        }
        else if(num<ar[mid])
        {
            n=mid-1
        }
        else if(ar[mid]==num)
        {
            println("${ar[mid]} is present in list ")
            found = true
            break
        }
    }
    if(!found)
    {
        println("OH! number not found in list ")
    }
}
