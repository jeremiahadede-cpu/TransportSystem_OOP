# Transport System - Class Activity 3

## Project Description
This is an Object-Oriented Transport Management System. It models different types of vehicles, such as Buses and Trains, using a parent `Transport` class. The system calculates fares based on distance and vehicle type, ensures safety checks via interfaces, and generates passenger tickets. 

In this latest version, the system accepts dynamic user input to generate a custom ticket for the user.

## Exceptions Implemented
To ensure the program runs safely and handles errors gracefully, the following exception handling was added:

1. **`InputMismatchException` (Catch Block):** Prevents the program from crashing if the user types letters or symbols when asked for the travel distance (which requires a numeric `double` value).
2. **General `Exception` (Catch Block):** Acts as a safety net to catch any other unforeseen runtime errors.
3. **`finally` Block:** Ensures that the `Scanner` object is properly closed to prevent memory leaks and prints a closing message regardless of whether the ticket was printed successfully or an error occurred.