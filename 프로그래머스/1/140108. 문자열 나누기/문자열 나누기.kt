class Solution {
    fun solution(s: String): Int {
    var count = 0
    var i = 0

    while (i < s.length) {
        val x = s[i]
        var xCount = 0
        var otherCount = 0

        while (i < s.length) {
            if (s[i] == x) {
                xCount++
            } else {
                otherCount++
            }
            i++
            if (xCount == otherCount) {
                break
            }
        }
        count++
    }

    return count
}
}