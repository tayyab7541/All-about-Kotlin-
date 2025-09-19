fun main()
{
    var height: Double=0.0
    var weight: Double=0.0
    var bmi=0.0

    print("Enter your height in cm = ")
    height=readLine()!!.toDouble()
    print("Enter your weight in kg = ")
    weight=readLine()!!.toDouble()
    var h=height/100.0
    var actualHeight=h*h
    bmi=weight/actualHeight
    if(bmi<18.5)
    {
        println("You are underweight")
    }
    else if(bmi>=18.5&&bmi<24.9)
    {
        println("your weight is normal")
    }
    else if(bmi>=25&&bmi<29.9)
    {
        println("You are overweighted ")
    }
    else if(bmi>=30)
    {
        println("You are obese")
    }


}

