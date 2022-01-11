package model.car;

public class Suv extends Car {
    public Suv() {
    }

    public Suv(String color, String name, String type, String engineType) {
        super.setColor(color);
        super.setName(name);
        super.setType(type);
        super.setEngineType(engineType);
    }

    @Override
    public String howToSpeedUp() {
        return "Nhấn ga";
    }

    @Override
    public String howToBrake() {
        return "Đạp phanh";
    }

    @Override
    public String howToDrive() {
        return "Dùng tay điểu khiển vô lăng";
    }
}
