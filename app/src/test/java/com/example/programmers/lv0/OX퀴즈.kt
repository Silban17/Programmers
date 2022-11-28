package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class OX퀴즈 {
    fun solution(quiz: Array<String>): Array<String> {
        return quiz.map {
            val list = it.split(" ")
            val result = if (list[1] == "+") {
                list[0].toInt().plus(list[2].toInt())
            } else {
                list[0].toInt().minus(list[2].toInt())
            }
            if (result == list[4].toInt()) {
                "O"
            } else {
               "X"
            }
        }.toTypedArray()
    }


    @Test
    fun answer() {
        Assert.assertArrayEquals(
            solution(listOf("3 - 4 = -3", "5 + 6 = 11").toTypedArray()),
            listOf("X", "O").toTypedArray()
        )
    }

    @Test
    fun answer2() {
        Assert.assertArrayEquals(
            solution(
                listOf(
                    "19 - 6 = 13",
                    "5 + 66 = 71",
                    "5 - 15 = 63",
                    "3 - 1 = 2"
                ).toTypedArray()
            ), listOf("O", "O", "X", "O").toTypedArray()
        )
    }

}