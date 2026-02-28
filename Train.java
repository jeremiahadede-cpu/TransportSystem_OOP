public class Train extends PublicTransport {

    private int carriageCount;
    private boolean isExpress;

    public Train(String id, double fare, int carriageCount, boolean isExpress) {
        super(id, fare);
        this.carriageCount = carriageCount;
        this.isExpress = isExpress;
    }

    @Override
    public double calculateFare(double distance) {
        if (isExpress) {
            return getBaseFare() + (distance * 5);
        } else {
            return getBaseFare() + (distance * 3);
        }
    }
}