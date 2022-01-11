package model.bike;

public class MoutainBike extends Bike {

    public MoutainBike() {
    }

    public MoutainBike(String color, String name, String type, String engineType) {
        super.setColor(color);
        super.setName(name);
        super.setType(type);
        super.setEngineType(engineType);
    }

    @Override
    public String howToRun() {
        return "Ngồi lên xe và đạp";
    }

    @Override
    public String howToBrake() {
        return "Bóp phanh";
    }

    @Override
    public String howToDrive() {
        return "Dùng tay điều khiển tay lái";
    }
}
