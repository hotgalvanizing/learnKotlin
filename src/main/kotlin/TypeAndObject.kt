class Sister(xingge: String, zhangxiang: String, shengyin: String) : Person(xingge, zhangxiang, shengyin){
    init {
        print("is a sister")
    }
}

open class Person(xingge: String, zhangxiang: String, shengyin: String) {
    init {
        println("new a Person")
    }
}


fun main() {
    val mSISTER: Sister = Sister("温柔", "甜美", "动人")
}