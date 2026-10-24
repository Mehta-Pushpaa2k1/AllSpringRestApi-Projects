package Model;
public class Car {

    private String carNo;
    private String brand;
    private String color;
    private double price;

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {

        System.out.println("CarNo" +carNo);
        System.out.println("Brand" +brand);
        System.out.println("Color" +color);
        System.out.println("Price" +price);
    }

}