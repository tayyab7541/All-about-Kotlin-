fun main(args: Array<String>) {
	var ch:Char?= 'a'
    print(" Enter alphabet = ")
    ch=readLine()?.trim()?.getOrNull(0)
    if(ch!=null)
    {
      if(ch>='a'&&ch<='z')
      {
      println(" lowerCase letter with it's position = ${ch-'a' +1} ")
      
      }
      else if(ch>='A'&&ch<='Z')
      {
     println(" upperCase letter with it's position = ${ch-'A' +1} ")
      }
      else 
      {
      println ("Invalid input")
      }
    }
    else 
    {
    print("No input")
    }
    
    
}
