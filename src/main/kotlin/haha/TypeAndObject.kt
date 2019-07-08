package haha

class Sister(xingge: String, zhangxiang: String, shengyin: String) : Person(xingge, zhangxiang, shengyin){
    init {
        print("is haha.getA sister")
    }
}

open class Person(xingge: String, zhangxiang: String, shengyin: String) {
    init {
        println("new haha.getA haha.Person")
    }
}


fun main() {
    val mSISTER: Sister = Sister("温柔", "甜美", "动人")
}