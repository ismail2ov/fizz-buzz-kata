package com.github.ismail2ov.fizzbuzz;

public class FizzBuzz {
    public String convert(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if (number == 5) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
