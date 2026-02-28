public abstract class Transport {
    private String transportID;
    private double baseFare;

    public Transport(String id, double fare) {
        this.transportID = id;
        this.baseFare = fare;
    }

    public String getTransportID() {
        return transportID;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public abstract double calculateFare(double distance);
}