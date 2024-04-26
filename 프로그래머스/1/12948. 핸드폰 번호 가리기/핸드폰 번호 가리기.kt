class Solution {
    fun solution(phone_number: String): String {
        var phone_number_length=phone_number.length
        var answer = "*".repeat(phone_number_length-4) +phone_number.substring(phone_number_length-4,phone_number.length )
        return answer
    }
}