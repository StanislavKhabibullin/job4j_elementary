package job4j.array;

import org.junit.Test;
import ru.job4j.array.Matrix;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void multiplay2() {
        int[][] expected = new int[][]{{1, 2}, {2, 4}};
        assertThat(
                Matrix.multiplay(2),
                is(expected)
        );
    }
}