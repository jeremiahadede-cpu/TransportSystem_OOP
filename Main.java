import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        
        Bus cityBus = new Bus("BUS-001", 2.50, "Route 42");
        Train expressTrain = new Train("TRN-999", 5.00, 10, true);

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Welcome to the Transport Ticketing System ===");

        
        try {
            
            System.out.print("Please enter the passenger's name: ");
            String passengerName = scanner.nextLine();

            
            System.out.print("Enter the distance to travel (in km): ");
            double distance = scanner.nextDouble(); 

            
            Ticket userTicket = new Ticket(passengerName, expressTrain, distance);
            
            System.out.println("\nGenerating your ticket...");
            userTicket.printTicket();

        } 
        
        catch (InputMismatchException e) {
            System.out.println("\nERROR: Invalid input! You must enter a valid number for the distance.");
        } 
        
        catch (Exception e) {
            System.out.println("\nERROR: An unexpected error occurred: " + e.getMessage());
        } 
        
        finally {
            System.out.println("\nClosing the ticketing system. Have a safe journey!");
            scanner.close(); 
        }
    }
}