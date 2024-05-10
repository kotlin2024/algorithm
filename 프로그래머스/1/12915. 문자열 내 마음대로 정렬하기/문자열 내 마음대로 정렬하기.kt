class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
    var answer = arrayOf<String>()
    
    strings.sortWith(compareBy({it[n]}, {it}))
    answer=strings
    return answer
}
}