public abstract class PublicTransport extends Transport {

    public PublicTransport(String id, double fare) {
        super(id, fare);
    }

    public void showTransportType() {
        System.out.println("This is a public transport vehicle.");
    }
}