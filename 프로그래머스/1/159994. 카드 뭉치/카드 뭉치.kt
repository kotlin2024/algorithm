class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
    var answer: String = "Yes"
    var answerList= mutableListOf<String>()
    var cards1List=cards1.toMutableList()
    var cards2List=cards2.toMutableList()

    for(i in goal){
        
        
        if(i in cards1List){
            if(i == cards1List[0]){
                cards1List.removeAt(0)
            }
            else{
                answer="No"
                break
            }
        }
        else if(i in cards2List){
            if(i==cards2List[0]){
                cards2List.removeAt(0)
            }
            else{
                answer="No"
                break
            }
        }
        else{
            answer="No"
            break
        }
        

    }
    return answer
}
}