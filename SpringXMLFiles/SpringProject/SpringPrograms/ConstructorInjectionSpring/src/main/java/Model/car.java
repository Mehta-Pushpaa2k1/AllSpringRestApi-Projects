package Model;

public class Car {

    private int carNo;
    private String brand;
    private String color;
    private double price;

    @Override
    public String toString() {
        return "Car{" +
                "carNo=" + carNo +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(int carNo, String brand, String color, double price) {
        this.carNo = carNo;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void display() {
        System.out.println("Car No : " + carNo);
        System.out.println("Brand  : " + brand);
        System.out.println("Color  : " + color);
        System.out.println("Price  : " + price);
    }
}