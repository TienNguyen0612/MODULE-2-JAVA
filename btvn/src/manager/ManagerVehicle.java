package manager;

import model.MyVehicle;
import model.bike.MoutainBike;
import model.car.Suv;
import model.motorbike.SportMotorBike;

public class ManagerVehicle {
    public static void main(String[] args) {
        MyVehicle[] myVehicles = new MyVehicle[3];
        myVehicles[0] = new MoutainBike("Blue", "Asama", "Moutain", "None");
        myVehicles[1] = new Suv("Red", "Bmw-X7", "SUV", "V8");
        myVehicles[2] = new SportMotorBike("White", "Ducati-1199", "Sport", "V2");

        for (MyVehicle myVehicle : myVehicles) {
            System.out.println(myVehicle);
        }
    }
}
