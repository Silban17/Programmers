package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `다음에 올 숫자` {
    fun solution(common: IntArray): Int {
        var answer: Int = 0

        val firstDiffValue = common[1] - common.first()
        val secondDiffValue = common[2] - common[1]
        if (firstDiffValue == secondDiffValue) {
            answer = common.last() + firstDiffValue
        } else {
            answer = common.last() * (secondDiffValue / firstDiffValue)
        }
        return answer
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(listOf(1, 2, 4).toIntArray()), 8)
    }
}