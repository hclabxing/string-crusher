package com.example.crusher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringCrusherTest {

    @Test
    void remove_01() {
        String input = "aabcccbbad";
        String result = App.processSteps(input, false);
        Assertions.assertEquals("d", result);
    }

    @Test
    void remove_02() {
        Assertions.assertEquals("abc", App.processSteps("abc", false));
    }

    @Test
    void remove_03() {
        Assertions.assertEquals("", App.processSteps("aaaaaa", false));
    }

    @Test
    void replace_01() {
        String input = "abcccbad";
        String result = App.processSteps(input, true);
        Assertions.assertEquals("d", result);
    }

    @Test
    void replace_02() {
        Assertions.assertEquals("ab", App.processSteps("bbbccc", true));
    }

    @Test
    void replace_03() {
        Assertions.assertEquals("", App.processSteps("aaa", true));
    }

}
