package pkge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    void testAdd() {
    	assertEquals(Calc.add(2,3),5);
    }
}
