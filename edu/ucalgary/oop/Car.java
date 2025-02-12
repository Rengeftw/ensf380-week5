package edu.ucalgary.oop;

public class Car {
    private String model;
    private Driver driver;
    private Engine engine;

    public Car(String model, Driver driver, Engine engine) {
        this.model = model;
        this.driver = driver;
        this.engine = engine;
    }

    public Car copy(boolean deepCopy) throws CloneNotSupportedException {
        if (deepCopy) {
            return new Car(model, new Driver(driver.getName), new Engine(engine.getEngineType));
        } else {
            return this;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
