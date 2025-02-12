package edu.ucalgary.oop;

public class Driver {
    private String name;

    public Driver(String name) {
        setName(name);
    }

    public Driver(Driver other) {
        this.name = other.name;
    }

    public String getname() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
