import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.DEFAULT_CONCURRENCY
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlinx.coroutines.delay
import kotlinx.coroutines.job

fun main()
{
    var num=0;
    do {
        print("Enter a positive number to display all the numbers from 1 to that number = ")
        num=readLine()!!.toInt()
    }while(num<=0)

    val job=CoroutineScope(Dispatchers.Default).launch{

        val job1=launch{
            printnum(num)
        }
        job1.join()

    }
    runBlocking{
        job.join()
    }

}

private suspend fun printnum(num:Int)
{
    for(i in 1..num)
    {
        println(i)
        delay(500)
    }
}
