package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `잘라서 배열로 저장하기` {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer: MutableList<String> = mutableListOf()

        for (index in 0 until my_str.length step n) {
            print(index)
            if (index + n > my_str.length) {
                answer.add(my_str.substring(index, my_str.length))
            } else {
                answer.add(my_str.substring(index, index + n))
            }
        }
        return answer.toTypedArray()
    }

    @Test
    fun answer() {
        Assert.assertArrayEquals(
            solution("abc1Addfggg4556b", 6), listOf("abc1Ad", "dfggg4", "556b").toTypedArray()
        )
    }

    @Test
    fun answer2() {
        Assert.assertArrayEquals(
            solution("abcdef123", 3), listOf("abc", "def", "123").toTypedArray()
        )
    }
}