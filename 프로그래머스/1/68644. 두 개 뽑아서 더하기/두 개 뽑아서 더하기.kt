class Solution {
    fun solution(numbers: IntArray): IntArray  {
    var answerList= mutableListOf<Int>()
    var answer: IntArray = intArrayOf()
    for(i in 0 ..numbers.size-1){
        for(j in i+1.. numbers.size-1){
            if(j<=numbers.size-1) answerList.add(numbers[i]+numbers[j])
        }
    }
    answer=answerList.distinct().toIntArray()
    answer.sort()

    return answer
}
}