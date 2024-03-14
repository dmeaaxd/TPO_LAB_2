import org.example.CsvHandler;
import org.example.TrigonometricFunctions;
import org.example.mocs.TrigonometricFunctionsMocs;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrigonometricFunctionsTest {
    private static final double DELTA = 1e-10;
    private static TrigonometricFunctions trigonometricFunctions;

    @BeforeClass
    public static void init(){
        trigonometricFunctions = new TrigonometricFunctions(DELTA);
        CsvHandler.openFile("logs.csv");
    }

    @AfterClass
    public static void exit(){
        CsvHandler.closeAndSave();
    }

    // Тестируем sin
    @Test
    public void testSinZero() {
        assertEquals(Math.sin(0), trigonometricFunctions.sin(0), DELTA);
    }

    @Test
    public void testSinPositiveValue() {
        assertEquals(Math.sin(1), trigonometricFunctions.sin(1), DELTA);
    }

    @Test
    public void testSinNegativeValue() {
        assertEquals(Math.sin(-1), trigonometricFunctions.sin(-1), DELTA);
    }

    @Test
    public void testSinPi() {
        assertEquals(Math.sin(Math.PI), trigonometricFunctions.sin(Math.PI), DELTA);
    }

    // Тестируем cos

    @Test
    public void testCosZero() {
        assertEquals(Math.cos(0), trigonometricFunctions.cos(0), DELTA);
    }

    @Test
    public void testCosPositiveValue() {
        assertEquals(Math.cos(1), trigonometricFunctions.cos(1), DELTA);
    }

    @Test
    public void testCosNegativeValue() {
        assertEquals(Math.cos(-1), trigonometricFunctions.cos(-1), DELTA);
    }

    @Test
    public void testCosPi() {
        assertEquals(Math.cos(Math.PI), trigonometricFunctions.cos(Math.PI), DELTA);
    }
}
