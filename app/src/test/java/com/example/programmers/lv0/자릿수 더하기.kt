package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `자릿수 더하기` {
    fun solution(n: Int): Int {
        return n.toString().map { it.digitToInt() }.sum()
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(1234), 10)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(930211), 16)
    }
}