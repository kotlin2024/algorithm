class Solution {
    fun solution(s: String): String {
    var answer = ""
    answer=s.toCharArray().sorted().joinToString("").reversed()
    return answer
}
}