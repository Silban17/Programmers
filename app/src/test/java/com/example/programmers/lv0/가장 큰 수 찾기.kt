package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

/*
* 문제 설명
* 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
* */

class `가장 큰 수 찾기` {
    fun solution(array: IntArray): IntArray {
        val maxValue = array.toList().maxOrNull() ?: 0
        val maxIndex = array.indexOf(maxValue)
        return intArrayOf(maxValue, maxIndex)
    }

    @Test
    fun answer() {
        Assert.assertArrayEquals(solution(listOf(1, 8, 3).toIntArray()), listOf(8, 1).toIntArray())
    }

    @Test
    fun answer2() {
        Assert.assertArrayEquals(solution(listOf(9, 10, 11, 8).toIntArray()), listOf(11, 2).toIntArray())
    }
}