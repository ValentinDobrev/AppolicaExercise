import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;


public class FileRepositoryTests {

    @Test
    public void test2() throws IOException {

        //Arrange
        FileRepository fileRepository = new FileRepository(new FileReader("C:\\Users\\DOBREV\\Desktop\\input.json"));

        Station[] expectedResults = new Station[]{
            new Station("MySSID", -10),
                new Station("Appolica", -15),
                new Station("MySSID", -1),
                new Station("Appolica", -5),
                new Station("Appolica", -50)
        };

        //Act
        Station[] stations = fileRepository.read();

        //Assert
        Assert.assertEquals(stations[0], expectedResults[0]);
        Assert.assertEquals(stations[1], expectedResults[1]);
        Assert.assertEquals(stations[2], expectedResults[2]);
        Assert.assertEquals(stations[3], expectedResults[3]);
        Assert.assertEquals(stations[4], expectedResults[4]);
    }
}
