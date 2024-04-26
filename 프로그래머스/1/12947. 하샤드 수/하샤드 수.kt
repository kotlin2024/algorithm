class Solution {
    fun solution(x: Int): Boolean {
    var answer:Boolean
    var xToList:List<String> = x.toString().toCharArray().map{it.toString()}.filter { it!="" }
    var xSum:Int=xToList.map{it.toInt()}.fold(0){acc,i->acc+i}
    if(x%xSum==0){
        answer=true
    }
    else{
        answer=false
    }
    return answer
}
}