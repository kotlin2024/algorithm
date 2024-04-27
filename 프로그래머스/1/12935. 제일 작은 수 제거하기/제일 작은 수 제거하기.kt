class Solution {
    fun solution(arr: IntArray): IntArray {
    var answer = intArrayOf()
    var answer_mutalbe = arr.toMutableList()
    var minVal = answer_mutalbe.minOrNull()
    answer_mutalbe.remove(minVal)
    answer=answer_mutalbe.toIntArray()
    if(answer.size==0) return intArrayOf(-1)
    else return answer
    }
}