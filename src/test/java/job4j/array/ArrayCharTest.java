package job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void startsWithTrue() {
        char[] input = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] input2 = new char[]{'H', 'e'};
        boolean srs = ArrayChar.startsWith(input, input2);
        boolean expected = true;
        assertThat(
                srs,
                is(expected)
        );
    }

    public void startsWithFalse() {
        char[] input = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] input2 = new char[]{'H', 'i'};
        boolean srs = ArrayChar.startsWith(input, input2);
        boolean expected = false;
        assertThat(
                srs,
                is(expected)
        );
    }
}