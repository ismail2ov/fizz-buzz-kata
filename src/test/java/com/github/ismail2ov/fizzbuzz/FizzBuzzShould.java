package com.github.ismail2ov.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {

    @Test
    void convert_1_to_string_1() {
        assertThat(new FizzBuzz().convert(1)).isEqualTo("1");
    }
}
