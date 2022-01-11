package thuchanh5.model;

public class Worker extends Cadres {
    private String level;

    public Worker() {
    }

    public Worker(String name, String dateOfBirth, String gender, String address, String level) {
        super(name, dateOfBirth, gender, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                ", level='" + level + '\'' +
                '}';
    }
}
