package dataTypeCasts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CastTest {

    @Test
    public void castTest() {
        Assertions.assertEquals((byte) 1, Cast.int2byte(1));
        Assertions.assertEquals((short) 1, Cast.int2short(1));
        Assertions.assertEquals((char) 1, Cast.int2char(1));
        Assertions.assertEquals("1", Cast.int2String(1));
        Assertions.assertEquals("-111", Cast.int2String(-111));
        Assertions.assertEquals(123, Cast.string2int("123"));
        Assertions.assertEquals(-123, Cast.string2int("-123"));
        Assertions.assertEquals(123, Cast.Long2int(123L));
        Assertions.assertEquals(123L, Cast.double2Long(123d));
        Assertions.assertTrue(Math.abs(0.5 - Cast.string2double("0.5")) < 1e-5);
        Assertions.assertTrue(Math.abs(0.523 - Cast.string2double("0.523")) < 1e-5);
        Assertions.assertTrue(Math.abs(1e-5 - Cast.string2double("01e-5")) < 1e-5);

    }
}
