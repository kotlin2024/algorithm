class Solution {
fun solution(s: String): Int {
    var answer: Int = 0
    var answerString=""
    var checkingString=""
    var StringToInt=""
    for(i in 0..s.length-1){
        if(s[i].digitToIntOrNull() !=null){
            answerString+=s[i]
        }
        else{
            checkingString+=s[i]
        }
        StringToInt= when (checkingString){
            "zero" -> "0"
            "one" -> "1"
            "two" -> "2"
            "three" -> "3"
            "four" -> "4"
            "five" -> "5"
            "six" -> "6"
            "seven" -> "7"
            "eight" -> "8"
            "nine" -> "9"
            else -> ""
        }
        answerString+=StringToInt
        if(StringToInt.length!=0) checkingString=""
    }

    answer=answerString.toInt()
    return answer
}
}