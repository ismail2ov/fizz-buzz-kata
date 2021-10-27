package com.github.ismail2ov.fizzbuzz;

public class FizzBuzz {
    public String convert(int number) {
        String result = getFizz(number) + getBuzz(number);

        if (! result.isEmpty()) {
            return result;
        }

        return String.valueOf(number);
    }

    private String getFizz(int number) {
        return isDivisibleBy(3, number) ? "Fizz" : "";
    }

    private String getBuzz(int number) {
        return isDivisibleBy(5, number) ? "Buzz" : "";
    }

    private boolean isDivisibleBy(int divisor, int number) {
        return number % divisor == 0;
    }
}
