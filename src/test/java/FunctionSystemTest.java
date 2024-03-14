import org.example.FunctionSystem;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FunctionSystemTest {
    private static final double DELTA = 1e-10;


    @ParameterizedTest
    @CsvSource({
            "0, Infinity",
            "-2, 0.04386948558589",
            "5, 0.4372432828671755"
    })
    public void testFunctionSystem(double x, double res) {
        FunctionSystem functionSystem = new FunctionSystem();
        assertEquals(res, functionSystem.calculate(x, DELTA), DELTA);
    }

    @Test
    public void testFunctionSystem_error() {
        FunctionSystem functionSystem = new FunctionSystem();
        assertThrows(NullPointerException.class, () -> {functionSystem.calculate((Double) null, DELTA);});
    }
}
