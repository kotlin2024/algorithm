class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        answer=arr.filter{ it % divisor == 0}.toIntArray().sortedArray()
        if(answer.size==0) answer= intArrayOf(-1)
        return answer
    }
}