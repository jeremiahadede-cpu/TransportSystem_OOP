public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("B001", 50, "R45");
        bus1.performSafetyInspection();
        bus1.trackLocation();

        Train train1 = new Train("T001", 100, 10, true);

        Ticket ticket1 = new Ticket("Jeremiah", bus1, 10);
        ticket1.printTicket();

        Ticket ticket2 = new Ticket("Amor", train1, 20);
        ticket2.printTicket();
    }
}