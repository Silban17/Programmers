package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

/*
* 문제 설명
* 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
* */

class `n의 배수 고르기` {
    fun solution(n: Int, numlist: IntArray): IntArray {
        return numlist.filter { it % n == 0 }.toIntArray()
    }

    @Test
    fun answer() {
        Assert.assertArrayEquals(solution(3, listOf(4, 5, 6, 7, 8, 9, 10, 11, 12).toIntArray()), listOf(6,9,12).toIntArray())
    }

    @Test
    fun answer2() {
        Assert.assertArrayEquals(solution(5, listOf(1, 9, 3, 10, 13, 5).toIntArray()), listOf(10,5).toIntArray())
    }

    @Test
    fun answer3() {
        Assert.assertArrayEquals(solution(12, listOf(2, 100, 120, 600, 12, 12).toIntArray()), listOf(120, 600, 12, 12).toIntArray())
    }
}