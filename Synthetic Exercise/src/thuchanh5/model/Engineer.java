package thuchanh5.model;

public class Engineer extends Cadres {
    private String specialized;

    public Engineer() {
    }

    public Engineer(String name, String dateOfBirth, String gender, String address, String specialized) {
        super(name, dateOfBirth, gender, address);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString() +
                ", specialized='" + specialized + '\'' +
                '}';
    }
}
