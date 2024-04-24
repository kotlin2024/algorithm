class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        for(i in 0..arr.size-1){
            answer+=arr[i]
        }
        return answer/arr.size
    }
}