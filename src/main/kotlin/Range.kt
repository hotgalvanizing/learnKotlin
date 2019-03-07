val range : IntRange = 0..1024
val range1 : IntRange = 0 until 1024
fun main() {
    print(range.contains(50))

    print(100 in range)

    for (i in range1){
        print(i)
    }
}