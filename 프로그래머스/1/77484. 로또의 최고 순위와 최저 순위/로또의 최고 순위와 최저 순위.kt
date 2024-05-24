class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    var correctNum =0
    var countZero=0
    for(i in 0..lottos.size-1){
        if(lottos[i]==0) countZero++
        for(j in 0..win_nums.size-1){
            if(lottos[i]==win_nums[j]) correctNum++
        }
    }
    var leastRankNum=correctNum
    var bestRankNum=correctNum+countZero

    var leastRank=0
    var bestRank=0

    when(leastRankNum){
        6 -> leastRank=1
        5 -> leastRank=2
        4 -> leastRank=3
        3 -> leastRank=4
        2 -> leastRank=5
        1 -> leastRank=6
        0 -> leastRank=6
    }
    when(bestRankNum){
        6 -> bestRank=1
        5 -> bestRank=2
        4 -> bestRank=3
        3 -> bestRank=4
        2 -> bestRank=5
        1 -> bestRank=6
        0 -> bestRank=6
    }
    answer= intArrayOf(bestRank,leastRank)

    return answer
}
}