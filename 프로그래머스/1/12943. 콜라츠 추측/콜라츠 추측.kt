class Solution {
    fun solution(num: Int): Int {
        var n = num.toLong()
        var answer = 0
        while (true) {
            if (n == 1L) {
                break
            }
            if (answer >=500) {
                answer = -1
                break
            }
            if (n%2 ==0L) {
                n=n/2
                answer+=1
            } else {
                n=(n*3)+1
                answer+=1
            }
        }
        return answer
    }
}