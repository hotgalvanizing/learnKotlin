package tryagain

fun main() {

    val args :Array<String> = arrayOf("jsjs","jsjsj","ksksk")

    for(arg in args){
        println(arg)
    }

    for ((index,value) in args.withIndex()){
        print("$index -> $value")
    }

    val list = MyIntList()
    list.add(1)
    list.add(2)
    for (i in list){
        println(i)
    }
}

class MyInterator (val iterator: Iterator<Int>){

    operator fun next():Int{
        return iterator.next()
    }

    operator fun hasNext():Boolean{
        return iterator.hasNext()
    }
}

class MyIntList{

    private val list = ArrayList<Int>()

    fun add(int:Int){
        list.add(int)
    }

    fun remove(int:Int){
        list.remove(int)
    }

    /**
     * 操作符重载
     */
    operator fun iterator() :MyInterator{
        return MyInterator(list.iterator())
    }

}