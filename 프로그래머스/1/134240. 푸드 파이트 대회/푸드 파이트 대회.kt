class Solution {
    fun solution(food: IntArray): String {
    var answer: String = ""
    var answerFood= mutableListOf<Int>()
    for( i in 0.. food.size-1){
        answerFood.add(food.map{
            if(it%2!=0) it-1
            else it
        }[i])
    }
    answerFood=answerFood.map{it->it/2}.toMutableList()
    var stringList= mutableListOf<String>()
    for(i in 0.. answerFood.size-1){
        stringList.add(i.toString().repeat(answerFood[i]))
    }
    answer=stringList.joinToString("")
    

    return answer+"0"+answer.reversed()
}
}