//智能类型转换

//可空：类型后面加？


fun main() {
    val person : JavaPerson = Child()

    if (person is Child){
        print(person.showname())
    }

    val string : String? = "hello"
    if (string != null){
        println(string.length)
    }

    val person1 : JavaPerson = JavaPerson()

//    强制类型转换as加？，如果不能强转返回null
    val child :Child? = person1 as? Child

    print(child)

}