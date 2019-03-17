import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CalculatorTests {

    @Test
    public void givenArray_whenCalculated_resultShouldBeListOfObjectsWithAverageData(){

        //Arrange
        Station[] stations = new Station[]{
            new Station("station1", 10),
            new Station("station2", 20),
            new Station("station2", 30),
        };

        //Act
        Calculator calculator = new Calculator();
        ArrayList<ProcessedStation> processedStations = calculator.calculate(stations);

        ArrayList<ProcessedStation> expectedResults = new ArrayList<>();
        expectedResults.add(new ProcessedStation("station1", 10));
        expectedResults.add(new ProcessedStation("station2", 25));

        //Assert
        Assert.assertEquals(processedStations.get(0), expectedResults.get(0));
        Assert.assertEquals(processedStations.get(1), expectedResults.get(1));
    }
}
