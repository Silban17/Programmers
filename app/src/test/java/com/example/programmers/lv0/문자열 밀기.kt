package com.example.programmers.lv0

import org.junit.Assert
import org.junit.Test

class `문자열 밀기` {
    fun bestSolution(A: String, B:String) : Int {
        return (B + B).indexOf(A)
    }

    fun solution(A: String, B: String): Int {
        var answer = 0

        var subString = A;
        A.forEach {
            if (subString == B) {
                return@forEach
            }
            subString = subString.last() + subString.substring(0, subString.length - 1)
            System.out.println(subString)
            answer++
        }
        return if (answer == A.length) -1 else answer
    }

    @Test
    fun answer() {
        Assert.assertEquals(solution("hello", "ohell"), 1)
    }

    @Test
    fun answer2() {
        Assert.assertEquals(solution("apple", "elppa"), -1)
    }
}