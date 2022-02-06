package com.example.github.copilot.service;

public class ExampleService {
    //find prime numbers
    public static int[] findPrimeNumbers(int n) {
        int[] primeNumbers = new int[n];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers[count] = i;
                count++;
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    //PI number
    public double pi(int n) {
        double pi = 0;
        for (int i = 0; i < n; i++) {
            pi += 1.0 / (2 * i + 1);
            pi -= 1.0 / (2 * i + 3);
        }
        return pi * 4;
    }

    //change all the fields where the given letter occurs in the string to x
    public String replace(String s, char c, char x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sb.append(x);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }


    //mersenne primes
    public int[] mersennePrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isMersennePrime(i)) {
                primes[count++] = i;
            }
        }
        return primes;
    }

    private boolean isMersennePrime(int n) {
        int m = (int) Math.pow(2, n) - 1;
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    //fibonacci
    private int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //euler
    public int euler(int n) {
        int euler = 0;
        for (int i = 1; i <= n; i++) {
            euler += 1.0 / i;
        }
        return (int) (euler * n);
    }

}


