package com.github.ismail2ov.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    void convert_1_to_string_1() {
        assertThat(this.fizzBuzz.convert(1)).isEqualTo("1");
    }

    @Test
    void convert_2_to_string_2() {
        assertThat(this.fizzBuzz.convert(2)).isEqualTo("2");
    }

    @Test
    void convert_3_to_string_Fizz() {
        assertThat(fizzBuzz.convert(3)).isEqualTo("Fizz");
    }

    @Test
    void convert_4_to_string_4() {
        assertThat(fizzBuzz.convert(4)).isEqualTo("4");
    }
}
