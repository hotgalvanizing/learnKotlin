package tryagain

/**
 * 中缀表达式
 * 只有一个参数，且用infix修饰的函数
 */
class Book(val name:String){

    infix fun on(place :String){
        println("《${name}》放在${place}上了")
    }

    override fun toString(): String {
        return "我拥有《${name}》这本书"
    }
}

fun main() {
    val myBook = Book("长安十二时辰")
    println(myBook)
    myBook on "桌子"

    val x = 5
    when (x){
        is Int -> println("Int")
        in 1..100 -> println("1-100")
    }

    val mode = when {
        x == 5 -> 1
        else -> 0
    }
    println(mode)
}