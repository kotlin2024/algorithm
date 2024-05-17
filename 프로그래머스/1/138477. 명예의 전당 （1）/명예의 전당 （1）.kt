class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
    var answer= mutableListOf<Int>()
    var newScoreList= mutableListOf<Int>()

    for(i in 0..score.size-1){

        if(i<k){
            newScoreList.add(score[i])
            answer.add(newScoreList.sortedDescending()[i])

        }

        else{
            newScoreList.add(score[i])
            answer.add(newScoreList.sortedDescending()[k-1])
        }
    }

    return answer.toIntArray()
}
}