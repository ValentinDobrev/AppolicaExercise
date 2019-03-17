class ProcessedStation {
    private String stationName;
    private double averagePower;

    ProcessedStation(String stationName, double averagePower) {
        this.stationName = stationName;
        this.averagePower = averagePower;
    }

    public String getStationName() {
        return stationName;
    }


    public double getAveragePower() {
        return averagePower;
    }

    @Override
    public boolean equals(Object obj) {
        ProcessedStation processedStation = (ProcessedStation)obj;
        return (this.getStationName().equals(processedStation.getStationName())) &&
                (this.getAveragePower() == processedStation.getAveragePower());
    }
}
