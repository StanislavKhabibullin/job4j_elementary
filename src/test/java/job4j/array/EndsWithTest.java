package job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {

    @Test
    public void endsWithTrue() {
        char[] input = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] input2 = new char[]{'l', 'o'};
        boolean srs = EndsWith.endsWithCheck(input, input2);
        boolean expected = true;
        assertThat(
                srs,
                is(expected)
        );
    }

    public void endsWithFalse() {
        char[] input = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] input2 = new char[]{'H', 'i'};
        boolean srs = EndsWith.endsWithCheck(input, input2);
        boolean expected = false;
        assertThat(
                srs,
                is(expected)
        );
    }
}