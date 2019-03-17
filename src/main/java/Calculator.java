import java.util.ArrayList;
import java.util.HashMap;

class Calculator {

    ArrayList<ProcessedStation> calculate(Station[] stations){

        ArrayList<ProcessedStation> processedStations = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> stationsToBeProcessed = new HashMap<>();
        int countOfStationsByName = 0;
        double sumOfPowersByName = 0;

        for (Station station :stations) {
            if(!stationsToBeProcessed.containsKey(station.getStationName())){
                stationsToBeProcessed.put(station.getStationName(),new ArrayList<>());
                stationsToBeProcessed.get(station.getStationName()).add(station.getPower());
            }else{
                stationsToBeProcessed.get(station.getStationName()).add(station.getPower());
            }
        }

        for (String key : stationsToBeProcessed.keySet()) {
            for (Integer value : stationsToBeProcessed.get(key)) {
                countOfStationsByName++;
                sumOfPowersByName += value;
            }
            processedStations.add(new ProcessedStation(key, sumOfPowersByName/countOfStationsByName));
            countOfStationsByName = 0;
            sumOfPowersByName = 0;
        }

        return processedStations;
    }
}
