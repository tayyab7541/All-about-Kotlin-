import kotlin.concurrent.thread

fun main() {

    println("This is start of main program with thread : ${Thread.currentThread().name} ")



    thread {
        println("This is start of long operation 1 with thread : ${Thread.currentThread().name}")
        Thread.sleep(5000)

        println("This is end of long operation 1 with thread : ${Thread.currentThread().name}")
    }



    println("This is end of main program with thread : ${Thread.currentThread().name}")


    
    thread {
        println("This is start of long operation 2 with thread : ${Thread.currentThread().name}")
        Thread.sleep(5000)

        println("This is end of long operation 2 with thread : ${Thread.currentThread().name}")
    }
}
