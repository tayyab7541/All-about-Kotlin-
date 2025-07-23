fun main(args: Array<String>) {
	var ch:Char?='a'
    print("Enter an alphabet =")
    ch=readLine()?.trim()?.getOrNull(0)
    if (ch!=null)
    {
    if(ch>='a'&&ch<='z')
    {
    println("This is lowerCase letter")
    }
    else if (ch>='A'&&ch<='Z')
    {
    println("This is upperCase letter")
    }
    else
    {
    println("Invalid input")
    }
    }
    else
    {
    println ("No input")
    }
}
