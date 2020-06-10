package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class DefragmentTest {

    @Test
    public void compressTest1() {
        String[] input = new String[]{"I", null, "wanna", null, "be", null, "compressed"};
        String[] rezult = Defragment.compress(input);
        String[] expected = new String[]{"I", "wanna", "be", "compressed", null, null, null};
        assertThat(
                rezult,
                is(expected)
        );
    }

    @Test
    public void compressTest2() {
        String[] input = new String[]{null, "I"};
        String[] rezult = Defragment.compress(input);
        String[] expected = new String[]{"I", null};
        assertThat(
                rezult,
                is(expected)
        );
    }

    @Test
    public void compressTest3() {
        String[] input = new String[]{null, "I", "wanna", null, "be", null, "compressed"};
        String[] rezult = Defragment.compress(input);
        String[] expected = new String[]{"I", "wanna", "be", "compressed", null, null, null};
        assertThat(
                rezult,
                is(expected)
        );
    }

    @Test
    public void compressTest4() {
        String[] input = new String[]{null, null, null, "I", "wanna", "be", "compressed"};
        String[] rezult = Defragment.compress(input);
        String[] expected = new String[]{"I", "wanna", "be", "compressed", null, null, null};
        assertThat(
                rezult,
                is(expected)
        );
    }
}