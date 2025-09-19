fun main()
{
    var bank=mutableListOf<Bank>()

    var found=true
    var num=0
    do {
        print("1:To creat Account \n2:To check balance \n3:To deposite amount \n4:To Withdraw amount \n5:To exit program \nEnter your choice = ")
        num=readLine()!!.toInt()
        if(num==1)
        {
            var p=0
            print("Enter your Full name = ")
            var n=readLine()!!.toString()
            print("Enter account type [Current / saving] =  ")
            var c=readLine()!!.toString()
            print("Enter amount you want to put into your account = ")
            var d=readLine()!!.toDouble()
            do
            {
                print("Enter pin to secure your account = ")
                p= readLine()!!.toInt()

                if(p<1000||p>9999)
                {
                    println("Please enter only 4 digit pin ")
                }
            }while(p<1000||p>9999)

            bank.add(Bank(n,c,d,p))
        }

        else if(num==2)
        {
            var check=false
            print("Enter your account pin to check balance = ")
            var p=readLine()!!.toInt()
            var size=bank.size-1
            for(i in 0.. size)
            {
                if(p==bank[i].pin)
                {
                    bank[i].dis()
                    check=true
                    break
                }
            }
            if(!check)
            {
                println("Oh! your pin is wrong ")
            }

        }

        else if(num==3)
        {
            var check=false
            print("Enter your account pin to deposit amount  = ")
            var p=readLine()!!.toInt()
            var size=bank.size-1
            for(i in 0.. size)
            {
                if(p==bank[i].pin)
                {
                    bank[i].dep()
                    check=true
                    break
                }
            }
            if(!check)
            {
                println("Oh! your pin is wrong ")
            }
        }
        else if(num==4)
        {
            var check=false
            print("Enter your account pin to withdraw amount  = ")
            var p=readLine()!!.toInt()
            var size=bank.size-1
            for(i in 0.. size)
            {
                if(p==bank[i].pin)
                {
                    bank[i].with()
                    check=true
                    break
                }
            }
            if(!check)
            {
                println("Oh! your pin is wrong ")
            }
        }
        else if(num==5)
        {
            found=false

        }
        else
        {
            println("Invalid option entered try again \n")
        }
    }while(found)
}

class Bank(var accountHolderName: String, var account: String, var balance: Double, var pin: Int)
{
    fun dis()
    {
        println("${accountHolderName.uppercase()} \t ${account.uppercase()} Account \t$balance")
    }


    fun dep()
    {
        var amount=0.0
        do {
            print("Enter ammount to deposite = ")
            amount=readLine()!!.toDouble()
            if(amount<=0.0)
            {
                println("Invalid amount enter again ")
            }
        }while(amount<=0.0)


        balance+=amount

        println("Deposit has been done successfully !")
    }


    fun with()
    {
        var amount=0.0
        do {
            print("Enter ammount to withdraw = ")
            amount=readLine()!!.toDouble()
            if(amount<=0.0)
            {
                println("Invalid amount enter again ")
            }
        }while(amount<=0.0)
        
        
        if(amount<=balance)
        {
            balance -= amount
            println("Withdraw has been done successfully !")
        }
        else
        {
            println("You enterd invalid amount")
        }       
    }

}
