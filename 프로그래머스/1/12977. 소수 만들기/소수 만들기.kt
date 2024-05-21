class Solution {
    fun solution(nums: IntArray): Int {
    var answer = -1
    var primeList=mutableListOf<Int>()
    var answerList= listOf<Int>()

    for(i in 0..(nums.size-3)) {
        for(j in i+1..(nums.size-2)) {
            for(k in j+1..(nums.size-1)) {
                primeList.add(nums[i]+nums[j]+nums[k])
            }
        }
    }
    answerList=primeList.filter { checkingPrime(it) }
    answer=answerList.size
    return answer
}
fun checkingPrime(nums: Int): Boolean {
        for(j in 2..nums-1){
            if(nums %j==0) return false
        }
    return true
}
}