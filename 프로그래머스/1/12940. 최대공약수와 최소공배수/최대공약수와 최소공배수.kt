class Solution {
    fun solution(n: Int, m: Int): IntArray {
    val bestnumber = mutableListOf<Int>()
    val bestnumber2 = mutableListOf<Int>()

    for (i in 1..n) {
        if (n % i == 0) {
            bestnumber.add(i)
        }
    }
    for (i in 1..m) {
        if (m % i == 0) {
            bestnumber2.add(i)
        }
    }

    var thebestnumber = 1
    for (i in 0 until bestnumber.size) {
        for (j in 0 until bestnumber2.size) {
            if (bestnumber[i] == bestnumber2[j]) {
                if (thebestnumber < bestnumber[i]) thebestnumber = bestnumber[i]
            }
        }
    }

    var leastnumber = n * m
    for (i in 1..m) {
        for (j in 1..n) {
            if (n * i == m * j) {
                if (leastnumber > m * j) leastnumber = m * j
            }
        }
    }

    return intArrayOf(thebestnumber, leastnumber)
}
}