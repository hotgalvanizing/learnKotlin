package haha

//kotlin数据类型不能强制转换

val string : String = "hello,world"
val fromChars :String = String(charArrayOf('haha.getA','haha.getB'))
val aa : Int = 12
val bb : Int = 32

fun main() {
    println(string)
    println(fromChars)
    println("$aa + $bb")
}