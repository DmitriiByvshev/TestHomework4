import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    Integer a = 5;
    Integer b = 7;
    Integer c = 9;

    @Test
    void testValue() {
        Assertions.assertNotNull(a);
        Assertions.assertNotNull(b);
        Assertions.assertNotNull(c);
        assertEquals(5, a.intValue(), "Не 5");
        assertEquals(7, b.intValue(), "Не 7");
        assertEquals(9, c.intValue(), "Не 9");
    }

    @Test
    void testSquare(){
        int p = (a + b + c) / 2;
        int S = (int)Math.sqrt(p * (p - a) * (p - b) * (p - c));
        Assertions.assertSame(12, S);
    }

}
