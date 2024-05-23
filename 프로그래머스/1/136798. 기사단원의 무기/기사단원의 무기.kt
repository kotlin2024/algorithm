class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
    var answer: Int = 0
    var answerList=mutableListOf<Int>()
    var divisorList= mutableListOf<Int>()

    for(j in 1.. number){
        for(i in 1..kotlin.math.sqrt(j.toDouble()).toInt()){
            if(j % i == 0){
                divisorList.add(i)
                if(i != j/i){
                    divisorList.add(j/i)
                }
            }
        }
        answerList.add(divisorList.size)
        divisorList.clear()
    }
    
    answer=answerList.map{
        if(it > limit) power
        else it
    }.fold(0){ acc,num -> acc+num}

    return answer
}
}