class Solution {
    fun solution(sizes: Array<IntArray>): Int {
    var answer: Int = 0
    var sortSize = sizes.map {
        if (it[1] >= it[0]) {
            var imsi = 0
            imsi = it[1]
            it[1] = it[0]
            it[0] = imsi
        }
        it
    }
    val answer1 = sortSize.maxByOrNull { it[0] }?.get(0) ?: 0
    val answer2 = sortSize.maxByOrNull { it[1] }?.get(1) ?: 0
    answer = answer1 * answer2

    return answer
}
}