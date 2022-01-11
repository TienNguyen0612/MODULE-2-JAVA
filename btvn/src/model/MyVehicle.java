package model;

public class MyVehicle {
    private String color;
    private String name;
    private String type;
    private String engineType;

    public MyVehicle() {
    }

    public MyVehicle(String color, String name, String type, String engineType) {
        this.color = color;
        this.name = name;
        this.type = type;
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "MyVehicle{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
