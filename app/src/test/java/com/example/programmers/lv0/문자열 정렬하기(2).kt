package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `문자열 정렬하기(2)` {
    fun solution(my_string: String): String {
        return my_string.lowercase().toList().sorted().joinToString("")
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution("Bcad"), "abcd")
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution("heLLo"), "ehllo")
    }

    @Test
    fun answer3() {
        Assert.assertEquals(solution("Python"), "hnopty")
    }
}