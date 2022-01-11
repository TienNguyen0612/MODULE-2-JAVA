package model.car;

import model.MyVehicle;
import vehicle.Vehicle;

public abstract class Car extends MyVehicle implements Vehicle {
    public abstract String howToSpeedUp();
}
