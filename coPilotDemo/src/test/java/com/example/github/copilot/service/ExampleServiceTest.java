package com.example.github.copilot.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleServiceTest {

    @Test
    void findPrimes() {
        ExampleService service = new ExampleService();
        int[] result = service.findPrimeNumbers(50);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    void replace() {
        ExampleService service = new ExampleService();
        assertEquals(service.replace("Hello World", 'l', 'x'), "Hexxo Worxd");
    }

}