package thuchanh5.model;

public class Staff extends Cadres {
    private String work;

    public Staff() {
    }

    public Staff(String name, String dateOfBirth, String gender, String address, String work) {
        super(name, dateOfBirth, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                ", work='" + work + '\'' +
                '}';
    }
}
