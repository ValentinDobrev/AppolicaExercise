import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class FileRepository {
    private Reader reader;
    private Writer writer;

    FileRepository(Reader reader){
        this.reader = reader;
    }

    public FileRepository(Writer writer) {
        this.writer = writer;
    }

    Station[] read() throws IOException {
        Gson gson = new Gson();

        Station[] stations = gson.fromJson(reader, Station[].class);

        reader.close();

        return stations;
    }

    void write(ArrayList<ProcessedStation> processedStations) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        gson.toJson(processedStations, writer);

        writer.close();
    }
}
