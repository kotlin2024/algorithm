class Solution {
    fun solution(numbers: IntArray): Int {
    var answer: Int = -1
    answer= 45-numbers.fold(0){acc,i -> acc+i}
    return answer
}
}