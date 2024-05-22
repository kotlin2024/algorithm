class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
    var answer: Int = 0
    var index = 0

    while (index < section.size) {
        val start = section[index]
        val end = start + m - 1

        while (index < section.size && section[index] <= end) {
            index++
        }

        answer++
    }

    return answer
}
}