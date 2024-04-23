class Solution {
    fun solution(n: Int): Int {
        var answer: Int
        if(n%2==0){
            if(n>=4){
                answer=(2+n)*(n/2)/2
            }
            else{
                answer=2
            }
        }
        else{
            if(n==1){
                answer=0
            }
            else if(n==3){
                answer=2
            }
            else{
                answer=(1+n)*((n-1)/2)/2
            }
        }
        return answer
    }
}