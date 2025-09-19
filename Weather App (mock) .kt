fun main()
{
    var max=(25..70).toList()
    var min=(0..24).toList()
    var hour=(1..24).toList()
    var mint=(0..59).toList()
    var sec=(0..59).toList()
    var rain=(0..100).toList()
    var cities= listOf<String>("Karachi","Lahore","Multan","Islamabad","peshawar")

    println(cities)
    var found = false
    print("Enter your complete city name = ")
    var name: String=readLine()!!.toString()
    var size=cities.size-1
    for(i in 0..size)
    {
        if(name.lowercase()==cities[i].lowercase())
        {
            println("Time = ${hour.random()}:${mint.random()} :${sec.random()}")
            println("Max temperature =${max.random()} ")
            println("Min temperature = ${min.random()}")
            println("Raining Chance = ${rain.random()}")

         found =true
            break
        }

    }
    if(!found )
    {
        println("Sorry your city is not available here ")
    }
}
