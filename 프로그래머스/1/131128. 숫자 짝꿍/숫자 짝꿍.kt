class Solution {
    fun solution(X: String, Y: String): String {
    
    val countX = IntArray(10)
    val countY = IntArray(10)

    for (char in X) {
        countX[char - '0']++
    }

    for (char in Y) {
        countY[char - '0']++
    }
    val commonChars = StringBuilder()

    for (i in 9 downTo 0) {
        val minCount = minOf(countX[i], countY[i])
        if (minCount > 0) {
            repeat(minCount) {
                commonChars.append(i)
            }
        }
    }

    val result = commonChars.toString()


    if (result.isEmpty()) {
        return "-1"
    }
    
    if (result == "0".repeat(result.length)) {
        return "0"
    }

    return result
}
}