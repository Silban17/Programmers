package com.example.programmers.lv1

import org.junit.Assert
import org.junit.Test

/**
 * Best Answer
 * PriorityQueue 를 이용함
 *
val answer = IntArray(score.size)
val pq = PriorityQueue<Int>()

score.forEachIndexed { index, i ->
pq.add(i)
if (pq.size > k) {
pq.poll()
}
answer[index] = pq.peek() as Int
}
return answer
 */

class `명예의 전당(1)` {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        var rank = mutableListOf<Int>()
        for (element in score) {
            rank.add(element)
            rank = rank.sortedDescending().toMutableList()
            if (rank.size > k) {
                rank.removeLast()
            }
            answer.add(rank.last())
        }
        return answer.toIntArray()
    }

    @Test
    fun answer() {
        Assert.assertArrayEquals(
            solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)),
            intArrayOf(10, 10, 10, 20, 20, 100, 100)
        )
    }

    @Test
    fun answer2() {
        Assert.assertArrayEquals(
            solution(
                4,
                intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)
            ), intArrayOf(0, 0, 0, 0, 20, 40, 70, 70, 150, 300)
        )
    }
}