import java.util.ArrayList;
import java.io.*;

public class TransportManager {
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void displayAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets found.");
        } else {
            for (Ticket t : tickets) {
                t.printTicket();
            }
        }
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Ticket t : tickets) {
                writer.write(t.toFileString());
                writer.newLine();
            }
            System.out.println("Tickets saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        tickets.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Loaded: " + line);
            }
            System.out.println("Tickets loaded from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}