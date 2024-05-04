class Solution {
    fun solution(s: String): String {
    var answer = ""
    var checkingnum=0
    var checkingPlace= true
    for (i in 0..s.length - 1) {
        if(checkingnum%2==0){
            answer+=s[i].uppercase()
            checkingnum++
        }
        else{
            answer+=s[i].lowercase()
            checkingnum++
        }

        if(s[i] == ' '){
            checkingPlace=true
            checkingnum=0
        }
        else{
            checkingPlace=false
        }
    }
    return answer
}
}