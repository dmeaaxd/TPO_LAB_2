import org.example.CsvHandler;
import org.example.FunctionSystem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IntegrationTest {
    private static final double DELTA = 1e-10;

    @Test
    public void integrationTestFunctionSystem_lessThanZero() {
        FunctionSystem functionSystem = new FunctionSystem();
        functionSystem.calculate(-2, DELTA);

        String[] expectedOut = {
                "sin,-2.0,-0.909297426825641",
                "cos,-2.0,-0.41614683654713874",
                "tan,-2.0,2.1850398632614403",
                "cot,-2.0,0.45765755436030225",
                "sin,-2.0,-0.909297426825641",
                "cos,-2.0,-0.41614683654713874",
                "tan,-2.0,2.1850398632614403"
        };
        String[] actualOut = CsvHandler.readCsv("logs.csv");

        for (int i = 0; i < Math.max(expectedOut.length, actualOut.length); i++) {
            String[] expectedLineSplit = expectedOut[i].split(",");
            String expectedMethod = expectedLineSplit[0];
            double expectedX = Double.parseDouble(expectedLineSplit[1]);
            double expectedResult = Double.parseDouble(expectedLineSplit[2]);

            String[] actualLineSplit = actualOut[i].split(",");
            String actualMethod = actualLineSplit[0];
            double actualX = Double.parseDouble(actualLineSplit[1]);
            double actualResult = Double.parseDouble(actualLineSplit[2]);

            assertEquals(expectedX, actualX, DELTA);
            assertEquals(expectedMethod, actualMethod);
            assertEquals(expectedResult, actualResult, DELTA);
        }
    }

    @Test
    public void integrationTestFunctionSystem_moreThanZero() {
        FunctionSystem functionSystem = new FunctionSystem();
        functionSystem.calculate(5, DELTA);

        String[] expectedOut = {
                "ln,5.0,1.609437912266385",
                "ln,5.0,1.609437912266385",
                "log5,5.0,1.0",
                "ln,5.0,1.609437912266385",
                "ln,3.0,1.098612288628832",
                "log3,5.0,1.464973520617642",
                "ln,5.0,1.609437912266385",
                "ln,10.0,2.302585092245511",
                "log10,5.0,0.6989700044904054",
                "ln,5.0,1.609437912266385",
                "ln,5.0,1.609437912266385",
                "ln,10.0,2.302585092245511",
                "log10,5.0,0.6989700044904054",
                "ln,5.0,1.609437912266385",
                "ln,10.0,2.302585092245511",
                "log10,5.0,0.6989700044904054",
                "ln,5.0,1.609437912266385",
                "ln,10.0,2.302585092245511",
                "log10,5.0,0.6989700044904054",
                "ln,5.0,1.609437912266385",
                "ln,10.0,2.302585092245511",
                "log10,5.0,0.6989700044904054",
                "ln,5.0,1.609437912266385",
                "ln,3.0,1.098612288628832",
                "log3,5.0,1.464973520617642",
        };

        String[] actualOut = CsvHandler.readCsv("logs.csv");

        for (int i = 0; i < Math.max(expectedOut.length, actualOut.length); i++) {
            String[] expectedLineSplit = expectedOut[i].split(",");
            String expectedMethod = expectedLineSplit[0];
            double expectedX = Double.parseDouble(expectedLineSplit[1]);
            double expectedResult = Double.parseDouble(expectedLineSplit[2]);

            String[] actualLineSplit = actualOut[i].split(",");
            String actualMethod = actualLineSplit[0];
            double actualX = Double.parseDouble(actualLineSplit[1]);
            double actualResult = Double.parseDouble(actualLineSplit[2]);

            assertEquals(expectedX, actualX, DELTA);
            assertEquals(expectedMethod, actualMethod);
            assertEquals(expectedResult, actualResult, DELTA);
        }
    }
}
