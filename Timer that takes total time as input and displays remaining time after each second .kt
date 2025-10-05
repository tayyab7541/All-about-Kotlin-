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

    var num: Int
    do {
        print("Enter time in seconds = ")
        num=readLine()?.toIntOrNull()?:0
        if(num<=0)
        {
            println("Enter only positive digit ")
        }
    }while(num<=0)

    val job= CoroutineScope(Dispatchers.Default).launch {

        val job1=launch {

            do {
                delay(1000)
                num=num-1
                println("Time Left = $num")

            }while(num>0)

            if(num==0)
            {
                println("Time ended ")
            }
        }
        job1.join()
    }
    runBlocking {
        job.join()
    }
}
