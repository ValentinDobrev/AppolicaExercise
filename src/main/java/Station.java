public class Station {
    private String stationName;
    private int power;

    public Station(String stationName, int power) {
        this.stationName = stationName;
        this.power = power;
    }

    String getStationName() {
        return stationName;
    }

    int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object obj) {
        Station station = (Station) obj;
        return (this.getStationName().equals(station.stationName)) &&
                (this.getPower() == station.getPower());
    }
}
