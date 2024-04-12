```
```




### Data Classes
```
data class User(val name: String, val age: Int)

fun main() {
    val user1 = User("홍길동", 30)
    println(user1)
}

```



### Collections
```
fun main() {
    val list = listOf("사과", "바나나", "체리")
    val mutableList = mutableListOf("사과", "바나나", "체리")
    mutableList.add("딸기")
    println(mutableList)
}

```

### Extension Functions
```
fun String.addExclamation(): String {
    return this + "!"
}

fun main() {
    val myString = "안녕하세요"
    println(myString.addExclamation())
}

```

### Lambda Expressions
```
fun main() {
    val list = listOf("사과", "바나나", "체리")
    list.filter { it.startsWith("바") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}

```

### Null Safety
```
fun main() {
    val name: String? = null
    println(name?.length ?: "널입니다.")
}

```
