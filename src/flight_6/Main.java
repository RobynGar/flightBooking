package flight_6;

import flight_6.Airport.Airport;
import flight_6.Flights.Flights;
import flight_6.User.Users;

public class Main {
    public static void main(String[] args) {

        Airport airport1 = new Airport("airport1", 5);
        Flights Norway = new Flights("Norway", 1400, 4);
        Users abdi = new Users(1, "Abdi", 284202985);
        Users aaron = new Users(2, "Aaron", 265782684);
        Users robyn = new Users(3, "Robyn", 542372964);
        Users suraya = new Users(4, "Suraya", 87343296);

    }

}
