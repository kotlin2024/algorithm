class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var answerArr = listOf(n)
        var answerArrSplit=answerArr[0].toString().split("")
        for(i in 0..answerArrSplit.size-1){
            try{
                answer+=answerArrSplit[i].toInt()
            }
            catch(e:NumberFormatException){
                answer+=0
            }
        }
        return answer
    }
}