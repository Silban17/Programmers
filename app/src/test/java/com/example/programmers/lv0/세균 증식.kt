package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test
import kotlin.math.pow

class `세균 증식` {
    fun solution(n: Int, t: Int): Int {
        var sum = n * 2
        for (index in 1 until t) {
            sum *= 2;
        }
        return sum;
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(2, 10), 2048)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(7, 15), 229376)
    }
}