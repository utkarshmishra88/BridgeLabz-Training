package com.junit.mathutilitytesting;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    MathUtils utils = new MathUtils();

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        utils.divide(10, 0);
    }
}
