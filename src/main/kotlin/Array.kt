val arrayInt : IntArray = intArrayOf(1,3,5)
val arratString : Array<String> = arrayOf("1","3")

fun main() {
    println(arrayInt.size)

    for (s in arratString){
        println(s)
    }

    print(arrayInt[2])
}