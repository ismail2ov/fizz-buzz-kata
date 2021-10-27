package com.github.ismail2ov.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Test
    void convert_3_to_string_Fizz() {
        String actual = fizzBuzz.convert(3);

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
