class Solution {
    fun solution(t: String, p: String): Int {
    var answer: Int = 0
    var loopLength = t.length-p.length
    for(i in 0..loopLength){
        if(t.substring(i,i+p.length).toLong()<= p.toLong()) answer++
    }
    return answer
}
}