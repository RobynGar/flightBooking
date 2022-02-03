package flight_6.Flights;

import flight_6.User.Users;

import java.util.Arrays;
import java.util.Objects;

public class Flights {
    private String name;
    private int time;
    private Users[] user;
    private int capacity;

    // default constructor
    public Flights() {

    }

    // constructor
    public Flights(String name, int time, int capacity) {
        this.name = name;
        this.time = time;
        this.user = new Users[capacity];
        this.capacity = capacity;
    }

    // name getter
    public String getName() {
        return name;
    }

    // name setter
    public void setName(String name) {
        this.name = name;
    }

    // time getter
    public int getTime() {
        return time;
    }

    //time setter
    public void setTime(int time) {
        this.time = time;
    }

    // user getter
    public Users[] getUser() {
        return user;
    }

    //user setter
    public void setUser(Users[] user) {
        this.user = user;
    }

    //capacity getter
    public int getCapacity() {
        return capacity;
    }

    //capacity setter
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", user=" + Arrays.toString(user) +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return time == flights.time && capacity == flights.capacity && Objects.equals(name, flights.name) && Arrays.equals(user, flights.user);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, time, capacity);
        result = 31 * result + Arrays.hashCode(user);
        return result;
    }
}