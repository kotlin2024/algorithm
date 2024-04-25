import kotlin.math.*
class Solution {
    fun solution(n: Long): Long {
    var answer: Long = 0
    if(sqrt(n.toDouble())==ceil(sqrt(n.toDouble()))){
        answer= ((sqrt(n.toDouble())).toInt() +1)* ( (sqrt(n.toDouble())).toInt() +1 ).toLong()
    }
    else{
        answer=-1
    }
        return answer
}
}