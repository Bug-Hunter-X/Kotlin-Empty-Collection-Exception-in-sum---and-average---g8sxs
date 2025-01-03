```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    val sum = doubledList.sum()
    println(sum) 
    val average = doubledList.average()
    println(average) 

    val emptyList = emptyList<Int>()
    val doubledEmptyList = emptyList.map { it * 2 }
    println(doubledEmptyList) 
    val sumEmpty = doubledEmptyList.sumOrNull() ?: 0 //safe call operator
    println(sumEmpty) 
    val averageEmpty = doubledEmptyList.averageOrNull() ?: 0.0 //safe call operator
    println(averageEmpty) 
}
```