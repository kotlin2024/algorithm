class Solution {
    fun solution(s: String, n: Int): String {
    var answer = ""
    answer=s.map{
        if(it.code != 32){
            if(it.code<=90){
                if(it.code+n>90){
                    Char(it.code+n-26)
                }
                else Char(it.code+n)
            }
            else{
                if(it.code+n>122){
                    Char(it.code+n-26)
                }
                else Char(it.code+n)

            }

        }
        else it
    }.joinToString("")
    return answer
}
}