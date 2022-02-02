package flight_6.User;

import java.util.Objects;

public class Users {
    private int ID;
    private String name;
    private int passportNumber;

    // Constructor - all fields
    public Users(int ID, String name, int passportNumber) {
        this.ID = ID;
        this.name = name;
        this.passportNumber = passportNumber;
    }

    // Constructor - default
    public Users() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Users{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", passportNumber=" + passportNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return ID == users.ID && passportNumber == users.passportNumber && Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, passportNumber);
    }
}
