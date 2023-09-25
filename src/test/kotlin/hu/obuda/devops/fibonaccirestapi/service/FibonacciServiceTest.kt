package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given


        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    fun shouldReturn0WhenCall5() {
        // given

        // when
        val result: Int = underTest.fibonacci(5)
        // then
        Assertions.assertEquals(5, result)
    }

    fun shouldReturn0WhenCall20() {
        // given

        // when
        val result: Int = underTest.fibonacci(20)
        // then
        Assertions.assertEquals(6765, result)
    }
}