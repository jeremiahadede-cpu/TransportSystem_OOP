public class Ticket {

    private String passengerName;
    private Transport vehicle;
    private double distance;

    public Ticket(String name, Transport vehicle, double distance) {
        this.passengerName = name;
        this.vehicle = vehicle;
        this.distance = distance;
    }

    public void printTicket() {
        double totalFare = vehicle.calculateFare(distance);
        System.out.println("----- TICKET -----");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Transport ID: " + vehicle.getTransportID());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + totalFare);
        System.out.println("------------------");
    }

    public String toFileString() {
        double totalFare = vehicle.calculateFare(distance);
        return passengerName + "," + vehicle.getTransportID() + "," + distance + "," + totalFare;
    }
}