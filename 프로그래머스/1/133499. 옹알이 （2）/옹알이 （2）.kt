class Solution {
    fun solution(babblings: Array<String>): Int {
    val canSay = listOf("aya", "ye", "woo", "ma")
    var answer = 0

    babblings.forEach {
        var bab = it

        if (!it.checkingDuplicatedwords(canSay)) {
            canSay.forEach { canSpeakWord ->
                bab = bab.replace(canSpeakWord, "★")
            }

            if (bab.replace("★", "").isEmpty()) answer++
        }
    }

    return answer
}

fun String.checkingDuplicatedwords(words: List<String>): Boolean {
    words.forEach {
        keyword ->
        if (this.contains(keyword + keyword)) return true
        
    }

    return false
}
}