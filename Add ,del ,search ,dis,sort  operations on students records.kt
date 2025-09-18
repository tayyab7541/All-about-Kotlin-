fun main()
{
    var s=mutableListOf<Student>(
        Student("Ali",1),
            Student("Ahmad",2),
        Student("Haider",3)
    )

    var check=true

    do
    {
     print("1:To add records \n2:To display records \n3:To remove a students records \n4:To search records \n5:To sort records \n6:To exit program \nEnter choice = ")
     var num=readLine()!!.toInt()
     if(num==1)
     {
         print("Enter name = ")
         var n=readLine()!!.toString()
         print("Enter id = ")
         var i=readLine()!!.toInt()
         s.add(Student(n,i))
         println("Record added successfully !")
     }
       else if(num==2)
        {
            var n=s.size-1
            println("Name \t ID ")
            for (i in 0.. n)
            {
                s[i].dis()
            }

        }
        else if(num==3)
        {
            print("Enter ID to delete records = ")
            var ind=readLine()!!.toInt()
            var n=s.size-1
            var found =false
            for (i in 0.. n)
            {
                if(s[i].id==ind)
                {
                    s.removeAt(i)
                    found =true
                    println("Record remove successfully")
                    break
                }
            }
            if(!found)
            {
                println("Sorry record with given id not found ")
            }
        }

        else if(num==4)
     {

         print("Enter ID to search records = ")
         var ind=readLine()!!.toInt()
         var n=s.size-1
         var found =false
         for (i in 0.. n)
         {
             if(s[i].id==ind)
         {
             s[i].dis()
             found=true;
             break;
         }
         }
         if(!found)
         {
             println("Sorry records count not be found ")
         }
     }


        else if(num==5)
     {
            s.sortedBy{it.id}

         var n=s.size-1
         println("Name \t ID ")
         for (i in 0.. n)
         {
             s[i].dis()
         }
     }
        else if(num==6)
     {
            check=false
     }
        else
     {
         print("Enter valid number \n")
     }
    }while(check)


}
class Student(var name:String,var id:Int)
{
    fun dis()
    {
        print("$name \t $id \n")
    }


}
