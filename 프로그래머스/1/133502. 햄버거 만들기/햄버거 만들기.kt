class Solution {
    fun solution(ingredient: IntArray): Int {
    var answer = 0
    val stack = mutableListOf<Int>()

    for (item in ingredient) {
        stack.add(item)
       
        if (stack.size >= 4 &&
            stack[stack.size - 4] == 1 &&
            stack[stack.size - 3] == 2 &&
            stack[stack.size - 2] == 3 &&
            stack[stack.size - 1] == 1) {

            repeat(4) { stack.removeAt(stack.size - 1) }
            answer++
        }
    }

    return answer
}
}