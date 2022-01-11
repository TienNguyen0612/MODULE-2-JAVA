package model.bike;

import model.MyVehicle;
import vehicle.Vehicle;

public abstract class Bike extends MyVehicle implements Vehicle {
    public abstract String howToRun();
}
