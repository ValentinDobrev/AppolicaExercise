import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws Exception{

        if (args.length == 0) {
            System.out.println("No command line arguments found.");}
        else {
            FileRepository fileRepositoryForReading = new FileRepository(new FileReader (args[1]));
            FileRepository fileRepositoryForWriting = new FileRepository(new FileWriter(args[3]));

            Calculator calculator = new Calculator();
            ArrayList<ProcessedStation> processedStations;

            Station[] stations = fileRepositoryForReading.read();

            processedStations = calculator.calculate(stations);

            fileRepositoryForWriting.write(processedStations);
        }
    }
}
