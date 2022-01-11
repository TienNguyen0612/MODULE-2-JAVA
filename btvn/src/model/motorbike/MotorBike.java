package model.motorbike;

import model.MyVehicle;
import vehicle.Vehicle;

public abstract class MotorBike extends MyVehicle implements Vehicle {
    public abstract String makeSound();
}
