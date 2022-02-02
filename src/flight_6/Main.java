package flight_6;

import flight_6.Airport.Airport;
import flight_6.Flights.Flights;
import flight_6.User.Users;
import flight_6.User.UsersServices;

public class Main {
    public static void main(String[] args) {

        Airport airport1 = new Airport("airport1", 5);
        Flights Norway = new Flights("Norway", 1400, 4);
        Users abdi = new Users("Abdi", 284202985);
        Users aaron = new Users("Aaron", 265782684);
        Users robyn = new Users("Robyn", 542372964);
        Users suraya = new Users("Suraya", 87343296);

        System.out.println(aaron);
        System.out.println(suraya);

    }

}
