package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `7의 배수` {
    fun solution(array: IntArray): Int {
        return array.joinToString("").count { it == '7' }
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(listOf(7, 77, 17).toIntArray()), 4)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(listOf(10, 29).toIntArray()), 0)
    }
}