package com.example.fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciAppTest {

    @Test
    void testFibonacciBaseCases() {
        assertEquals(0, FibonacciApp.fibonacci(0));
        assertEquals(1, FibonacciApp.fibonacci(1));
    }

    @Test
    void testFibonacciRecursiveCases() {
        assertEquals(1, FibonacciApp.fibonacci(2));
        assertEquals(2, FibonacciApp.fibonacci(3));
        assertEquals(3, FibonacciApp.fibonacci(4));
        assertEquals(5, FibonacciApp.fibonacci(5));
        assertEquals(8, FibonacciApp.fibonacci(6));
        assertEquals(13, FibonacciApp.fibonacci(7));
    }
}
