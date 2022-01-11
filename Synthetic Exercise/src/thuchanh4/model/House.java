package thuchanh4.model;

public class House {
    private int amount_Of_People;
    private int houseNumber;

    public House() {
    }

    public House(int amount_Of_People, int houseNumber) {
        this.amount_Of_People = amount_Of_People;
        this.houseNumber = houseNumber;
    }

    public int getAmount_Of_People() {
        return amount_Of_People;
    }

    public void setAmount_Of_People(int amount_Of_People) {
        this.amount_Of_People = amount_Of_People;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return " House{" +
                "amount_Of_People=" + amount_Of_People +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
