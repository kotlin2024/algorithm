fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    for(i in 1..b){
        print("*".repeat(a)+"\n")
    }
}