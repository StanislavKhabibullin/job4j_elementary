package job4j.array;

import org.junit.Test;
import ru.job4j.array.SwitchArray;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void swap() {
        int[] input = new int[]{4, 3, 2, 1};
        int source = 1;
        int dest = 2;
        int[] expected = new int[]{4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, source, dest);
        assertThat(
                rsl,
                is(expected)
        );
    }

    @Test
    public void swapBorder() {
        int[] input = new int[]{4, 3, 2, 1};
        int[] expected = new int[]{1, 3, 2, 4};
        int[] rsl = SwitchArray.swapBorder(input);
        assertThat(
                rsl,
                is(expected)
        );
    }
}