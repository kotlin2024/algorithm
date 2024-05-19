import java.time.LocalDate
class Solution {
    fun solution(a: Int, b: Int): String {
    var answer = ""
    val date=LocalDate.of(2016,a,b)
    answer=date.dayOfWeek.toString()
    return answer.substring(0,3)
}
}