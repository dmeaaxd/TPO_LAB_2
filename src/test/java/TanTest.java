import org.example.CsvHandler;
import org.example.TrigonometricFunctions;
import org.example.mocs.TrigonometricFunctionsMocs;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TanTest {

    private static final double DELTA = 1e-10;
    private static TrigonometricFunctionsMocs trigonometricFunctionsMocs;

    @BeforeClass
    public static void init(){
        trigonometricFunctionsMocs = new TrigonometricFunctionsMocs();
        CsvHandler.openFile("logs.csv");
    }

    @AfterClass
    public static void exit(){
        CsvHandler.closeAndSave();
    }

    // Тестируем tan -> sin, cos

    @Test
    public void testTanZero() {
        assertEquals(Math.tan(0), trigonometricFunctionsMocs.tan(0), DELTA);
    }

    @Test
    public void testTanPositiveValue() {
        assertEquals(Math.tan(1), trigonometricFunctionsMocs.tan(1), DELTA);
    }

    @Test
    public void testTanNegativeValue() {
        assertEquals(Math.tan(-1), trigonometricFunctionsMocs.tan(-1), DELTA);
    }

    @Test
    public void testTanPi() {
        assertEquals(Math.tan(Math.PI), trigonometricFunctionsMocs.tan(Math.PI), DELTA);
    }
}
