package flight_6.User;

import flight_6.Flights.Flights;

import java.util.Random;

public class UsersServices {
    // generate random unique id
    // create an array of numbers to loop through
    // so that each new user gets an incremented number
    // given as their id
    private static int count = 0;   // Initial count
    public static int createIds(){  // Method to increment our count
        count++;
        return count;   // Returns to count for use
    }



}
