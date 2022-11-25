package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test
import kotlin.math.sqrt

class `제곱수 판별하기` {
    fun solution(n: Int): Int {
        val sqrt = sqrt(n.toDouble()).toInt()
        return if (sqrt * sqrt == n) {
            1
        } else {
            2
        }

    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(144), 1)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(976), 2)
    }
}