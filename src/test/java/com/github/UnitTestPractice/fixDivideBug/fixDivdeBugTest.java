package fixDivideBug;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class fixDivdeBugTest {

    @Test
    public void fixdivdebug(){
        Assertions.assertTrue(Math.abs(1.5-fixDivdeBug.divide(3,2))<1e-5);
        Assertions.assertTrue(Math.abs(2.5-fixDivdeBug.divide(5,2))<1e-5);
        Assertions.assertTrue(Math.abs(-2.5-fixDivdeBug.divide(-5,2))<1e-5);
        Assertions.assertTrue(Math.abs(1d/2d-fixDivdeBug.divide(1,2))<1e-5);
        Assertions.assertTrue(Math.abs(1d/3d-fixDivdeBug.divide(1,3))<1e-5);
    }
}