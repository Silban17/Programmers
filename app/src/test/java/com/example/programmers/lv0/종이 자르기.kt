package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `종이 자르기` {
    fun solution(M: Int, N: Int): Int {
        return M * N - 1
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(2, 2), 3)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(2, 5), 9)
    }

    @Test
    fun answer3() {
        Assert.assertEquals(solution(1, 1), 0)
    }
}