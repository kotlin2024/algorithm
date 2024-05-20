class Solution {
    fun solution(answers: IntArray): IntArray {
    var answer = intArrayOf()
    var supo1 = "12345".repeat(answers.size/5 +1)
    var supo2 = "21232425".repeat(answers.size/8 +1)
    var supo3= "3311224455".repeat(answers.size/10 +1)
    val supo1Array=supo1.map{ it.toString().toInt()}.toIntArray()
    val supo2Array=supo2.map{ it.toString().toInt()}.toIntArray()
    val supo3Array=supo3.map{ it.toString().toInt()}.toIntArray()

    var supo1Count=0
    var supo2Count=0
    var supo3Count=0


    for(i in 0..answers.size-1){
        if(supo1Array[i]==answers[i]) supo1Count++
        if(supo2Array[i]==answers[i]) supo2Count++
        if(supo3Array[i]==answers[i]) supo3Count++
    }
    answer = intArrayOf(supo1Count,supo2Count,supo3Count)

    var maxSupo= 0
    var maxSupoArray= mutableListOf<Int>()
    for(i in 0..2){
        if(answer[i]==maxSupo){
            maxSupoArray.add(i+1)
        }
        if(answer[i]>maxSupo){
            maxSupoArray.clear()
            maxSupo = answer[i]
            maxSupoArray.add(i+1)
        }

    }

    return maxSupoArray.toIntArray()
}
}