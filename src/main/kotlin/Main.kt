fun main(args: Array<String>) {

    val intArray = intArrayOf(1, 2, 6, 4, 8)
    val string = "Armen nemra"

    println(avarageCounter(intArray))

    println(
        "$string " +
                if (isPolindrome(string)) "- is polindrome"
                else "- is not a polindrome"
    )
}

//Task 1
fun avarageCounter(intArray: IntArray): Int {
    var summ: Int = 0
    var counter: Int = 0
    for (item in intArray.withIndex()) {
        if (item.index % 2 == 0) {
            summ += intArray[item.index]
            counter++
        }
    }
    return summ / counter
}

//Task 2
fun isPolindrome(string: String): Boolean {
    val reversedString = StringBuilder(string).reverse().toString()
    return string.equals(reversedString, ignoreCase = true)
}