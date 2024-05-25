
class Solution {
    fun solution(babblings: Array<String>): Int {
    val canSay = listOf("aya", "ye", "woo", "ma")
    var answer = 0

    babblings.forEach {
        var bab = it

        if (!it.checkingDuplicatedWords(canSay)) {
            canSay.forEach { canSpeakWord ->
                bab = bab.replace(canSpeakWord, "★")
            }

            if (bab.all{it.toString()=="★"}) answer++
        }
    }

    return answer
}

fun String.checkingDuplicatedWords(words: List<String>): Boolean {
    words.forEach {
        keyword ->
        if (this.contains(keyword + keyword)) return true

    }

    return false
}
}