class Solution {
    fun solution(s: String): IntArray {
    var answer= mutableListOf<Int>()
    for(i in 0.. s.length-1){
        if(i==0) answer.add(-1)
        else{
            for(j in i-1 downTo  0){
                if(s[j]==s[i]){
                    answer.add(i-j)
                    break
                }
                else{
                    if(j==0) answer.add(-1)
                }
            }
        }

    }
    answer.toIntArray()


    return answer.toIntArray()
}
}