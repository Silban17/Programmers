package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

/*
* 문제 설명
* 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
* */
class `숫자 찾기` {
    fun solution(num: Int, k: Int): Int {
        return num.toString().indexOf(k.toString()).takeIf { it >= 0 }?.let {
            it + 1
        } ?: -1
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(29183, 1), 3)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(232443, 4), 4)
    }

    @Test
    fun answer3() {
        Assert.assertEquals(solution(123456, 7), -1)
    }
}