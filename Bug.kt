```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    //This will print [2,4,6,8,10] 
    val sum = doubledList.sum()
    println(sum) //This will print 30
    val average = doubledList.average()
    println(average) //This will print 6.0

    val emptyList = emptyList<Int>()
    val doubledEmptyList = emptyList.map { it * 2 }
    println(doubledEmptyList) //This will print []
    //This will throw an exception: val sumEmpty = doubledEmptyList.sum() 
    //This will throw an exception: val averageEmpty = doubledEmptyList.average()
}
```