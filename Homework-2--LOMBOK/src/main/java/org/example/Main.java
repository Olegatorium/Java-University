package org.example;
public class Main {
    public static void main(String[] args) {
        CarWithLombok carWithLombok1 = new CarWithLombok("X5", "BMW", 2018, 18500, "orange", 6 );
        CarWithLombok carWithLombok2 = new CarWithLombok("Q7", "BMW", 2021, 40500, "white", 16 );

        System.out.println(carWithLombok1);
        System.out.println(carWithLombok2);

        System.out.println(carWithLombok1.getColor());

        int year = carWithLombok1.getYear();

        carWithLombok1.setColor("black");

        System.out.println("Are these objects equal? " + carWithLombok1.equals(carWithLombok2));
        System.out.println("The HashCode of this object is " + carWithLombok2.hashCode());
        System.out.println("The HashCode of this object is " + carWithLombok1.hashCode());
    }
}