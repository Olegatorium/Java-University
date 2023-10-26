public class Main {
    public static void main(String[] args) {
        Car car = new Car("X5", "BMW", 2018, 18500, "orange", 6 );
        System.out.println(car.toString());
        car.Sell();
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());
        System.out.println(car.getColor());
        System.out.println(car.getQuantity());

        car.setBrand("Audi");
        car.setModel("Q7");
        car.setYear(2000);
        car.setPrice(10900);
        car.setColor("White");
        car.setQuantity(3);

        System.out.println(car.toString());
    }
}



public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

public void Delivery(){

        System.out.println("Car " + brand + " model " + model + " " + year + " " + color + " costs: " + price);

}
public void Sell(){

        System.out.println("The new car is bought\nThe old quantity is " + quantity);
        quantity = quantity - 1;

        System.out.println("The new quantity is " + quantity);

}

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
