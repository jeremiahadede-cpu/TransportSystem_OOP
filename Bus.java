public class Bus extends PublicTransport implements ISafetyCheck, Trackable {

    private String routeNumber;
    private static int busCount = 0;

    public Bus(String id, double fare, String route) {
        super(id, fare);
        this.routeNumber = route;
        busCount++;
    }

    @Override
    public double calculateFare(double distance) {
        return getBaseFare() + (distance * 2);
    }

    @Override
    public void performSafetyInspection() {
        System.out.println("Bus safety inspection completed.");
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking Bus on route " + routeNumber);
    }
}