class Solution {
    fun solution(s: String): String {
    var answer = ""
    var sToList= s.toMutableList()
    if(s.length %2==1) answer= sToList[(sToList.size/2)].toString()
    else answer= "${sToList[(sToList.size/2)-1].toString()}${sToList[(sToList.size/2)].toString()}"
    return answer
}
}