package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `연속된 수의 합` {
    fun solution(num: Int, total: Int): IntArray = ((total / num) - (num - 1) / 2).let { start ->
        IntArray(num) {
            start + it
        }
    }

    @Test
    fun answer() {
        Assert.assertArrayEquals(solution(3, 12), listOf(3, 4, 5).toIntArray())
    }

    @Test
    fun answer2() {
        Assert.assertArrayEquals(solution(5, 15), listOf(1, 2, 3, 4, 5).toIntArray())
    }

    @Test
    fun answer3() {
        Assert.assertArrayEquals(solution(4, 14), listOf(2, 3, 4, 5).toIntArray())
    }

    @Test
    fun answer4() {
        Assert.assertArrayEquals(solution(5, 5), listOf(-1, 0, 1, 2, 3).toIntArray())
    }
}