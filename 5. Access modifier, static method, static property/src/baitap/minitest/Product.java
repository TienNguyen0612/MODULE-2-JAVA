package baitap.minitest;

public class Product {
    private int id;
    private String name;
    private double price;
    private String type;
    private String moneyUnit = "USD";

    public Product() {}

    public Product(int id, String name, double price, String type, String moneyUnit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.moneyUnit = moneyUnit;
    }

    public Product(int id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoneyUnit() {
        return moneyUnit;
    }

    public void setMoneyUnit(String moneyUnit) {
        this.moneyUnit = moneyUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", moneyUnit='" + moneyUnit + '\'' +
                '}';
    }
}
