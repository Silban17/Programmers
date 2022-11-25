package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `문자열안에 문자열` {
    fun solution(str1: String, str2: String): Int {
        return if (str1.contains(str2)) {
            1
        } else {
            2
        }
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution("ab6CDE443fgh22iJKlmn1o", "6CD"), 1)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution("ppprrrogrammers", "pppp"), 2)
    }
}