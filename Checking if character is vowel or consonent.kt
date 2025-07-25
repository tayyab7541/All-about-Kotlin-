fun main() {
    
          var ch :Char? = 'a'
          print("Enter character = ")
          ch=readLine()?.trim()?.getOrNull(0)
          if(ch!=null)
           {
               if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
                  {
                      printl("It is a vowel character ")
                   }
                  else 
                  { 
                      println("Invalid input ")
                    }
           }
 }
