fun getName():String?{
    return null
}

fun main() {
    val name : String = getName() ?: return
    println(name)

    val values : String? = "hello"
    //两个叹号，强制认定values不为空
    println(values!!.length)
}