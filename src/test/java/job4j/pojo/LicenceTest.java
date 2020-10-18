package job4j.pojo;

import org.junit.Test;
import ru.job4j.pojo.Licence;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class LicenceTest {

    @Test
    public void eqTest() {
        Licence first = new Licence();
        first.setCode("audio");
        Licence second = new Licence();
        second.setCode("audio");
        assertThat(first.equals(second), is(true));
    }

}