package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

/**
 *
 * Best Solution
class Solution {
    fun solution(babbling: Array<String>): Int {
        val regex = "aya|ye|woo|ma".toRegex()
        val answer: Int = babbling.map { it.replace(regex, "") }
            .filter { it.length == 0 }
            .count()
        return answer
    }
}
*/

class 옹알이 {
    fun solution(babbling: Array<String>): Int {
        var answer = 0
        val defaultBabbling = listOf("aya", "ye", "woo", "ma")
        babbling.forEach { text ->
            var tempText = text;
            defaultBabbling.forEach { defaultText ->
                if (tempText.contains(defaultText)) {
                    tempText = tempText.replaceFirst(defaultText, " ")
                }
            }
            if (tempText.trim().isEmpty()) {
                answer++
            }
        }

        return answer
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(listOf("aya", "yee", "u", "maa", "wyeoo").toTypedArray()), 1)
    }
}