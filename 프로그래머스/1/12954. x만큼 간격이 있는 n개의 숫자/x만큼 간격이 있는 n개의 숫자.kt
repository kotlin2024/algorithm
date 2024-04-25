class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        for(i in 0..n-1){
            answer[i] = x.toLong()*(i+1)
        }
        return answer
    }
}