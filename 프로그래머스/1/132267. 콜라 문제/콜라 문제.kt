class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
    var answer: Int = 0
    var empty=n
    var fullRequest =a
    var full = b
    var answerRemainder: Int=0
    while(empty>=fullRequest){


        if(empty%fullRequest==0){
            answer+=(empty/fullRequest)*full
        }
        else{
            answer+=(empty/fullRequest)*full
            answerRemainder+=(empty%fullRequest)

        }

        empty=empty/fullRequest*full
        println(empty)



        if((empty+answerRemainder)/fullRequest>=1){
            empty+=answerRemainder
            answerRemainder=0
        }



    }


    return answer
}
}