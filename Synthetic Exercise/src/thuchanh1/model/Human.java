package thuchanh1.model;

public class Human {
    private String name;
    private String birthDate;
    private String idCard;

    public Human() {
    }

    public Human(String name, String birthDate, String idCard) {
        this.name = name;
        this.birthDate = birthDate;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void displayHuman() {
        System.out.printf("\n%-15S", name);
        System.out.printf("%-15s", birthDate);
        System.out.printf("%-15s", idCard);
    }
}
