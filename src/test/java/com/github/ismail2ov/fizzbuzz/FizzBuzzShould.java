package com.github.ismail2ov.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        this.fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void convert_regular_number_to_string(int input, String expected) {
        String actual = this.fizzBuzz.convert(input);

        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void convert_numbers_divisible_by_3_and_not_divisible_by_5_to_Fizz(int input) {
        String actual = fizzBuzz.convert(input);

        assertThat(actual).isEqualTo("Fizz");
    }

    @Test
    void convert_3_to_string_Buzz() {
        String actual = fizzBuzz.convert(5);

        assertThat(actual).isEqualTo("Buzz");
    }

    @Test
    void convert_15_to_string_FizzBuzz() {
        String actual = fizzBuzz.convert(15);

        assertThat(actual).isEqualTo("FizzBuzz");
    }
}
