package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MaxMath;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class MaxMathTest {

    @Test
    public void max() {
        int rsl = MaxMath.max(1, 2);
        assertThat(rsl, is(2));
    }

    @Test
    public void max4() {
        int rsl = MaxMath.max(1, 2, 3, 4);
        assertThat(rsl, is(4));
    }

    @Test
    public void firstMax() {
        assertThat(
                MaxMath.whichMax(25, 14),
                is("first number is max")
        );
    }

    @Test
    public void secondMax() {
        assertThat(
                MaxMath.whichMax(25, 76),
                is("second number is max")
        );
    }

    @Test
    public void theSame() {
        assertThat(
                MaxMath.whichMax(30, 30),
                is("both numbers are the same")
        );
    }
}