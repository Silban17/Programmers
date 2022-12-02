package com.example.programmers.lv1

import org.junit.Assert
import org.junit.Test
import kotlin.math.sqrt

class `푸드 파이트 대회` {
    fun solution(food: IntArray): String {
        val foodList = mutableListOf<Int>()
        for(foodCount in 1 until food.size) {
            repeat(food[foodCount] / 2) { foodList.add(foodCount) }
        }
        return "${foodList.joinToString("")}0${foodList.reversed().joinToString("")}"
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution(intArrayOf(1, 3, 4, 6)), "1223330333221")
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution(intArrayOf(1, 7, 1, 2)), "111303111")
    }
}