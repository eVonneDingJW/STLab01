package testTriangle;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import triangle.Triangle;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestTriangle {
    private int expected;
    private int a;
    private int b;
    private int c;

    public TestTriangle(int expected, int a, int b ,int c) {
        super();
        this.expected = expected;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
                {1,2,2,2},
                {2,5,5,7},
                {3,3,4,5},
                {-1,1,1,9},
        });
    }

    @Test
    public void typeTest() {
        Triangle t = new Triangle();
        assertEquals(expected,t.type(a, b, c),0);
    }
}
