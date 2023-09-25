package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/")
class FibonacciController {

    @Autowired
    var fibonacciService: FibonacciService? = null

    @GetMapping(value = ["fibonacci"])
    open fun fibonacci(@RequestParam n: Int): Int? {
        // TODO - If n is greater than 46 then return BAD REQUEST use HttpStatus
        if (n > 46) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST)
        }
        return fibonacciService?.fibonacci(n)
    }
}