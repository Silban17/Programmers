package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test
/*
* 문제 설명
* 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
* */

class `배열의 유사도` {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        return s1.count { s2.contains(it) }
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(listOf("a", "b", "c").toTypedArray(), listOf("com", "b", "d", "p", "c").toTypedArray()), 2)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(listOf("n", "omg").toTypedArray(), listOf("m", "dot").toTypedArray()), 0)
    }
}