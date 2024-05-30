class Solution {
    fun solution(s: String, skip: String, index: Int): String {
    val skipSet = skip.toSet()  
    val sb = StringBuilder()

    for (ch in s) {
        var sToAscii = ch.code
        var countingIndex = index

        while (countingIndex > 0) {
            sToAscii += 1
            if (sToAscii > 122) {
                sToAscii -= 26
            }
            if (sToAscii.toChar() !in skipSet) {
                countingIndex--
            }
        }
        sb.append(sToAscii.toChar())
    }

    return sb.toString()
}
}