package tryagain

fun main() {
    var result = ""
    for (i in 0..6) {
        val intVal = (Math.random() * 26 + 97).toInt()
        result += intVal.toChar()
    }
    println(result)

    var str = "fkjh"
    //报空指针异常
//    var num1: Int = str.toInt()
    var num2: Int? = str.toIntOrNull()
//    println(num1)
    println(num2)

    /**
     * 可空类型变量
     * 不允许直接调用方法或者属性
     * 应该先判断该变量不为null
     */

    /**
     * 安全调用，空指针返回null
     */
    var b: String? = "Sksjsj"
    println(b?.length)
    b = null
    println(b?.length)

    val myArr: Array<String?> = arrayOf("palk", "jsh", null, "palaj")
    for (item in myArr) {
        item?.let { println(it) }
    }

    var len1 = if (b != null) b.length else -1
    println(len1)

    /**
     * 使用Elvis运算符 ?:
     */
    var len2 = b?.length ?: -1

    /**
     * 强制调用
     */
//    print(b!!.length)

    /**
     * 转义字符串：“”
     * 原始字符串：
     */
    /**
     * |竖线作为默认边界符
     * trimMargin()
     * 去掉原始字符串中不需要的缩进
     */
    val txt = """
        |天上白玉京
        |十二楼五路
        |身上那散数
    """.trimMargin()

    println(txt)

    /**
     * 字符串模板
     */
    val bookPrice = 79
    var s = "图书的价格是： ${bookPrice}"
    println(s)









}