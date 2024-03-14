import org.example.TrigonometricFunctions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TrigonometricFunctionsTest {
    private static final double DELTA = 1e-10;

    // Тестируем sin
    @Test
    public void testSin_zero(){

    }

    // Тестируем cos

    @Test
    public void testCosZero() {
        assertEquals(1.0, Math.cos(0), DELTA);
    }

    @Test
    public void testCosPositiveValue() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions(DELTA);
        assertEquals(Math.cos(1), trigonometricFunctions.cos(1), DELTA);
    }

    @Test
    public void testCosNegativeValue() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions(DELTA);
        assertEquals(Math.cos(-1), trigonometricFunctions.cos(-1), DELTA);
    }

    @Test
    public void testCosLargeValue() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions(DELTA);
        assertEquals(Math.cos(1000), trigonometricFunctions.cos(1000), DELTA);
    }

    @Test
    public void testCosSmallValue() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions(DELTA);
        assertEquals(Math.cos(0.001), trigonometricFunctions.cos(0.001), DELTA);
    }

    @Test
    public void testCosPi() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions(DELTA);
        assertEquals(Math.cos(Math.PI), trigonometricFunctions.cos(Math.PI), DELTA);
    }

    // Тестируем tan -> sin, cos

}
