import kotlin.math.pow
class Solution {
    fun solution(n: Int): Int {
    var result = ""
    var answer = 0.0
    var number = n
    while (number > 0) {
        val remainder = number % 3
        result = remainder.toString() + result
        number /= 3
    }

    for (i in 0..result.length-1) {
        val digit = result[i].toString().toInt() 
        answer += digit.toDouble() * 3.0.pow(i.toDouble()) 
    }

    return answer.toInt()
}
}