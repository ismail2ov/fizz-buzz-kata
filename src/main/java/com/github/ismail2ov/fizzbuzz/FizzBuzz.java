package com.github.ismail2ov.fizzbuzz;

public class FizzBuzz {
    public String convert(int number) {
        if (isDivisibleBy(3, number)) {
            if (isDivisibleBy(5, number)) {
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if (isDivisibleBy(5, number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleBy(int divisor, int number) {
        return number % divisor == 0;
    }
}
