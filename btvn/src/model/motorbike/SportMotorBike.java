package model.motorbike;

public class SportMotorBike extends MotorBike {
    public SportMotorBike() {
    }

    public SportMotorBike(String color, String name, String type, String engineType) {
        super.setColor(color);
        super.setName(name);
        super.setType(type);
        super.setEngineType(engineType);
    }

    @Override
    public String makeSound() {
        return "Bíp bíp";
    }

    @Override
    public String howToBrake() {
        return "Bóp phanh tay để phanh trước hoặc đạp phanh chân để phanh sau";
    }

    @Override
    public String howToDrive() {
        return "Dùng tay điều khiển tay lái";
    }
}
