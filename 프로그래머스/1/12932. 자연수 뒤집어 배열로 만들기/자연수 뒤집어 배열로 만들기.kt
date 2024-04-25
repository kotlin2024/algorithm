class Solution {
    fun solution(n: Long):List<Int>{
    var strList = listOf(n.toString())
    var answer = arrayListOf<Int>()
    var answer1 = strList[0].split("")
    for (i in answer1.size-2 downTo 1) {
        answer.add(answer1[i].toInt())
    }
    return answer

}
}