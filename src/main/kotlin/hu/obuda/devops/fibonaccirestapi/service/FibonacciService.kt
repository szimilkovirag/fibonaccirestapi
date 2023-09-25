package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        return if (n < 2) 1
        else {
            fibonacci(n-2) + fibonacci(n-1)
        }
    }
}