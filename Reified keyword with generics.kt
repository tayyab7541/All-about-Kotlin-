fun main()
{
    var list=mutableListOf(1,2,3,4,5,'A','B','C'," Malik ","Tayyab")
    var inter=checklist<Int>(list)
    var charac=checklist<Char>(list)
    var stri=checklist<String>(list)

    println("Integers :")
    for (element in inter)
    {
        println(element)
    }
    println("Characters :")
    for(element in charac)
    {
        println(element)
    }
    println("Strings :")
    for(element in stri)
    {
        println(element)
    }

}

inline fun<reified T> checklist(list: List<Any>): List<T>
{
    var specific=mutableListOf<T>()
    for(element in list)
    {
        if(element is T)
        {
            specific.add(element)
        }
    }
    return specific
}
