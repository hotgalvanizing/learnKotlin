package haha

import kotlinx.coroutines.*

//fun haha.main(args: Array<String>) {
//    println("Start")
//
//    // 启动一个协程
//    GlobalScope.launch {
//        delay(1000)
//        println("Hello")
//    }
//
//    Thread.sleep(2000) // 等待 2 秒钟
//    println("Stop")
//}

fun main() {
    println("Start")

    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }

    Thread.sleep(2000)
    println("stop")
}