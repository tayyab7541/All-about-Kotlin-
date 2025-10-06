import com.sun.tools.javac.Main
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.DEFAULT_CONCURRENCY
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.withContext
import kotlin.math.min


fun main() {

    var hours=0
    var minute=0
    var second=0

    val job= CoroutineScope(Dispatchers.Default).launch {

        val job1 = launch {

            while(true) {
                delay(1000)

                second += 1
                if (second == 60) {
                    minute += 1;
                    second = 0;
                }

                if (minute == 60) {
                    hours += 1;
                    minute = 0;
                }

                 println("$hours:$minute:$second")
            }
        }
        job1.join()
    }
    runBlocking {
        job.join()
    }
}
