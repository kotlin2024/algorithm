class Solution {
    fun solution(left: Int, right: Int): Int {
    var answer: Int = 0
    for(i in left..right){
        var countWeak=0
        for(j in 1..i){
            if(i%j==0) countWeak++
        }
        if(countWeak%2==0) answer+=i
        else answer-=i
    }
    return answer
}

}