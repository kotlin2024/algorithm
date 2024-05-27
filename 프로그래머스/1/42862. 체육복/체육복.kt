class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    var answer = n-lost.size
    var lostSet = lost.sorted().toMutableSet()
    var reserveSet = reserve.sorted().toMutableSet()

    for(i in lost){
        if(reserveSet.contains(i)){
            lostSet.remove(i)
            reserveSet.remove(i)
            answer++
        }
    }

    for(i in lostSet.toList()){
        if(reserveSet.contains(i-1)){
            reserveSet.remove(i-1)
            answer++
        }
        else if(reserveSet.contains(i+1)){
            reserveSet.remove(i+1)
            answer++
        }

    }



    return answer
}

}