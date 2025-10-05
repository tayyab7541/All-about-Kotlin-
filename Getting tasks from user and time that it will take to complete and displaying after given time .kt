import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.DEFAULT_CONCURRENCY
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlinx.coroutines.delay
import kotlinx.coroutines.job


fun main() {
    var tasks=mutableListOf<String>()
    var del=mutableListOf<Int>()

    var str:String
    var cond=" "
    var num: Int
    do {
        print("Enter Message for task = ")
        str=readLine()!!.toString()
        do {
            print("Enter time that it will take to complete in seconds = ")
            num=readLine()?.toIntOrNull()?:0

            if(num<0)
            {
                println("Enter only positive number \n")
            }
        }while (num<0)

        tasks.add(str)
        del.add(num)

        print("Enter 'done' if you have enrolled all the tasks else 'n' = ")
        cond=readLine()!!.toString()
    }while(cond.lowercase()!="done")

    var job= CoroutineScope(Dispatchers.Default).launch {

        val job1=launch {
            for (i in 0..del.size-1)
            {
                printfun(del[i],tasks[i])
            }
        }
        job1.join()
    }
    runBlocking {
        job.join()
    }
}

private suspend fun printfun(num:Int,message: String)
{
    val millisec =num*1000L
    delay(millisec)
    println(message)


}
