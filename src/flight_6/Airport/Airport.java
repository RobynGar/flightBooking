package flight_6.Airport;

import flight_6.Flights.Flights;

import java.util.Arrays;
import java.util.Objects;

public class Airport {
    private String name;
    private int capacity;
    private Flights[] flight;

    // constructor
    public Airport(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.flight = new Flights[capacity];
    }
    // default constructor
    public Airport(){
    }

    public Flights[] getFlight() {
        return flight;
    }

    public void setFlight(Flights[] flight) {
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "flight=" + Arrays.toString(flight) +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return capacity == airport.capacity && Arrays.equals(flight, airport.flight) && Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, capacity);
        result = 31 * result + Arrays.hashCode(flight);
        return result;
    }
}
