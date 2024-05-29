class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
    val answer = mutableListOf<Int>()

    for (target in targets) {
        var countingClick = 0
        var valid = true

        for (char in target) {
            var click = Int.MAX_VALUE

            for (key in keymap) {
                val index = key.indexOf(char)
                if (index != -1 && index < click) {
                    click = index
                }
            }

            if (click == Int.MAX_VALUE) {
                countingClick = -1
                valid = false
                break
            } else {
                countingClick += click + 1
            }
        }

        if (valid) {
            answer.add(countingClick)
        } else {
            answer.add(-1)
        }
    }

    return answer.toIntArray()
}

}