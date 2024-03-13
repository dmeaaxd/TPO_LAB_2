import org.example.FunctionSystem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FunctionSystemTest {
    private static final double DELTA = 1e-10;

    @Test
    public void testFunctionSystem_zero() {
        FunctionSystem functionSystem = new FunctionSystem();
        assertEquals(Double.POSITIVE_INFINITY, functionSystem.calculate(0, DELTA), DELTA);
    }

    @Test
    public void testFunctionSystem_lessThanZero() {
        FunctionSystem functionSystem = new FunctionSystem();
        assertEquals(0.04386948558589, functionSystem.calculate(-2, DELTA), DELTA);
    }

    @Test
    public void testFunctionSystem_moreThanZero() {
        FunctionSystem functionSystem = new FunctionSystem();
        assertEquals(0.4372432828671755, functionSystem.calculate(5, DELTA), DELTA);
    }

    @Test
    public void testFunctionSystem_error() {
        FunctionSystem functionSystem = new FunctionSystem();
        assertThrows(NullPointerException.class, () -> {functionSystem.calculate((Double) null, DELTA);});
    }
}
