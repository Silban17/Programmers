package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

/*
* 문제 설명
* my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
* */

class `문자열 계산하기` {
    fun solution(my_string: String): Int {
        val split = my_string.split(" ")
        var answer = split[0].toInt()

        for (index in 2 until split.size step 2) {
            val secondNum = split[index].toInt()
            if (split[index - 1] == "+") {
                answer += secondNum
            } else {
                answer -= secondNum
            }
        }
        return answer
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution("3 + 4 - 4 + 4"), 7)
    }
}