class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
    var answer: String = ""
    var mbtiMutable= mutableListOf<String>()
    for(i in 0..survey.size-1){
        if(choices[i]>4){
            mbtiMutable.add(survey[i].substring(1,2).repeat(choices[i]-4))

        }
        else if(choices[i]<4){
            mbtiMutable.add(survey[i].substring(0,1).repeat(4-choices[i]))

        }
        else mbtiMutable.add(survey[i])
    }

    val scores = mutableMapOf<Char,Int>()
    for(mbti in mbtiMutable){
        for(char in mbti){
            scores[char] = scores.getOrDefault(char, 0) + 1
        }
    }

    var answerBuilder= StringBuilder()
    answerBuilder.append(
        if(scores.getOrDefault('R',0)>= scores.getOrDefault('T',0)){
        'R'
    }
    else {
        'T'
        }
    )
    answerBuilder.append(
        if(scores.getOrDefault('C',0)>= scores.getOrDefault('F',0)){
            'C'
        }
        else {
            'F'
        }
    )
    answerBuilder.append(
        if(scores.getOrDefault('J',0)>= scores.getOrDefault('M',0)){
            'J'
        }
        else {
            'M'
        }
    )
    answerBuilder.append(
        if(scores.getOrDefault('A',0)>= scores.getOrDefault('N',0)){
            'A'
        }
        else {
            'N'
        }
    )
    answer=answerBuilder.toString()
    return answer
}
}