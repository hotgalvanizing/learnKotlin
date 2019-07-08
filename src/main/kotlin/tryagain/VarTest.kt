package tryagain

fun main() {
    /**
     * 变量类型显示指定，
     * 或者根据初始值确定变量类型，
     * 不能声明变量不指定类型，也不赋初值
     */
    var b : Int
    var name = "TestVar"
    b = 20
    /**
     * val声明的变量是不可变变量，
     * 不能被重新赋值
     */
    val book = "book"
    /**
     * 局部范围的常量：允许声明时不指定初始值，
     * 只要在第一次初始化前指定初始值即可。
     * 类的常量属性：可以在声明时指定初始值，
     * 或者在类的构造器中指定初始值。
     */
    /**
     * Int类型不支持null值
     */
//    var notNull : Int = null
    /**
     * 要存储null值，应该使用Byte？、Short？等
     */
    var nullAble :Int? = null
    /**
     * 不带？映射为Java中的基本类型
     * 带？映射为Java中的基本类型的包装类型
     */
    var pm1 :Int = 200
    var pm2 :Int = 200
    println(pm1 === pm2)//返回True

    var ob1 :Int? = 200
    var ob2 :Int? = 200
    println(ob1 === ob2)//返回False

    /**
     * pm1 pm2对应Java int类型，===基本类型比较返回true
     * ob1 ob2对应java Int类型，===比较要求相同对象才返回true
     */

    /**
     * 总体来说kotlin中==比较的是数值是否相等,
     * 而===比较的是两个对象的地址是否相等
     */

    /**
     * 3个特殊的浮点型的数值：
     * 正无穷大、负无穷大和非数
     */

}