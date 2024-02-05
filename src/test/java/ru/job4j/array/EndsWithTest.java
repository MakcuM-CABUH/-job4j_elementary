package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EndsWithTest {

    @Test
    public void wenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o' };
        char[] postfix = {'l', 'o' };
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void wenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o' };
        char[] postfix = {'l', 'a' };
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }

    @Test
    public void wenNotEndWithPrefixThenFalseTo() {
        char[] word = {'H', 'e', 'l', 'l', 'o' };
        char[] postfix = {'I', 'o' };
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }
}