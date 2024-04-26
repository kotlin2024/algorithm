class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
       if(b>=a){
           for(i in a..b){
               answer+=i
           }
       }
       else{
           for(i in b..a){
               answer+=i
           }
       }
        
        return answer
    }
}