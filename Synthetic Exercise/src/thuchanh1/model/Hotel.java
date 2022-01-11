package thuchanh1.model;

public class Hotel {
    private int daysStayIn;
    private String typeOfRoom;
    private int price;

    public Hotel() {
    }

    public Hotel(int daysStayIn, String typeOfRoom, int price) {
        this.daysStayIn = daysStayIn;
        this.typeOfRoom = typeOfRoom;
        this.price = price;
    }

    public int getDaysStayIn() {
        return daysStayIn;
    }

    public void setDaysStayIn(int daysStayIn) {
        this.daysStayIn = daysStayIn;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayHotel() {
        System.out.printf("%-15d", daysStayIn);
        System.out.printf("%-15S", typeOfRoom);
        System.out.printf("%-15d", price);
        System.out.println();
    }
}
