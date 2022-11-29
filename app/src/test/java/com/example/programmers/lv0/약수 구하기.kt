package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

/**
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */

/**
 * Best Answer
 * (1..n).filter { n % it == 0 }.toIntArray()
 */

class `약수 구하기` {
    fun solution(n: Int): IntArray {
        val answer  = mutableListOf<Int>()
        for (i in 1..n) {
            if (n % i == 0) {
                answer.add(i)
            }
        }
        return answer.toIntArray()
    }

    @Test
    fun answer() {
        Assert.assertArrayEquals(solution(24), intArrayOf(1, 2, 3, 4, 6, 8, 12, 24))
    }

    @Test
    fun answer2() {
        Assert.assertArrayEquals(solution(29), intArrayOf(1, 29))
    }
}