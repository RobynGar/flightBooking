package flight_6.Flights;

import flight_6.User.Users;

public class FlightsServices {

public void addUsers(Users user, Flights flight){
    for (int i = 0; i < flight.getUser().length; i++) {
        if (flight.getUser()[i] == null){
            flight.getUser()[i] = user;
            break;

        } else {
            throw new IllegalStateException(flight.getUser() + "sorry this flight is full");

        }
    }
}


}


// 1. add user
// 2. how many users in the flight array
// 3. number of free spots in flight
// 4. isFlightFull
// TBC. remove user (maybe, if we feel brave)
// Scanner pScanner = new Scanner(System.in);
//        String value = pScanner.nextLine();
//        System.out.println(value);
