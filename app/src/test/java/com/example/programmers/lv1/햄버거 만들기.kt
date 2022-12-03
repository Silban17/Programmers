package com.example.programmers.lv1

import org.junit.Assert
import org.junit.Test
import kotlin.math.sqrt

class `햄버거 만들기` {
    fun solution(ingredient: IntArray): Int {
        var count = 0
        var index = 0
        var text = ingredient.joinToString("")
        while (true) {
            text.indexOf("1231", startIndex = index).takeIf { it >= 0 }?.let {
                count++
                index = it - 2
                text = text.removeRange(it, it + 4)
            } ?: return count
        }
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1)), 2)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(intArrayOf(1, 3, 2, 1, 2, 1, 3, 1, 2)), 0)
    }
}