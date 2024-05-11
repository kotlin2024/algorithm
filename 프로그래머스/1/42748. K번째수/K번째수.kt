class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()
    var sortCommand= intArrayOf()
    var answerList= mutableListOf<Int>()

    for(j in 0 until commands.size){

        sortCommand=array.sliceArray(commands[j][0]-1 .. commands[j][1]-1)
        sortCommand.sort()
        answerList.add(sortCommand[commands[j][2]-1])



    }
    answer= answerList.toIntArray()
    return answer
}
}