package flight_6;

import flight_6.Airport.Airport;
import flight_6.Flights.Flights;
import flight_6.User.Users;
import flight_6.User.UsersServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Airport airport1 = new Airport("airport1", 5);
        Flights Norway = new Flights("Norway", 1400, 4);
        Flights Spain = new Flights("Spain", 1100, 10);
        Flights USA = new Flights("USA", 1900, 8);
        Users abdi = new Users("Abdi", 284202985);
        Users aaron = new Users("Aaron", 265782684);
        Users robyn = new Users("Robyn", 542372964);
        Users suraya = new Users("Suraya", 87343296);

        Scanner pScanner = new Scanner(System.in);
        System.out.println("Welcome to the flight booking system.");
        System.out.println("What service you you like?");
        System.out.println("1: book a flight");
        System.out.println("2: airport management");
        int service = pScanner.nextInt();
        pScanner.nextLine();
        if (service == 1) {
            //service 1 will prompt them to create users (give name and passport number)
            // show list of flights in airport 1
            // pick a flight
            // trigger a method that checks if that flight is
            // full if full throw exception that it is full if
            // not adds them to flight
            System.out.println("Please enter your name: ");
            String nameInput = pScanner.nextLine();
            System.out.println("Please enter your 9 digit passport number: ");
            int passportNumInput = pScanner.nextInt();
            Users user1 = new Users(nameInput, passportNumInput);
        }
//Could anyone hear me?

        // i can hear uuu

        // It asked for camera permission, but not mic...
    }
}