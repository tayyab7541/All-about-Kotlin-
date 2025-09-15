fun main()
{
    var num = (0..20).toList()
    var guess=0
    var found=false
    println("You only have 5 chances to guess the number in range of 0 to 20 \n")
    for(i in 1..5)
    {
        print("Enter Guessing number = ")
        guess=readLine()!!.toInt()

        if(num.random()==guess)
        {
            println("Your guess is correct ")
            found=true
            break
        }
        else
        {
            println("No, enter number again ")
        }
    }

    if(!found)
    {
        println("Oh! You loose ")
    }
}
