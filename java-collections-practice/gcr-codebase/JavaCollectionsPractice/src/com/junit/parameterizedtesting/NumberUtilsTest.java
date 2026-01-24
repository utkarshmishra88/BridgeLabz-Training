package com.junit.parameterizedtesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class NumberUtilsTest {

    private int input;
    private boolean expected;

    public NumberUtilsTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {4, true},
                {6, true},
                {7, false},
                {9, false}
        });
    }

    @Test
    public void testIsEven() {
        NumberUtils utils = new NumberUtils();
        assertEquals(expected, utils.isEven(input));
    }
}
