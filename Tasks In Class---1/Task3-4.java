import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Task3();
       // Task4();

    }

    public static void Task3(){

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("Our number: " + number + "\n");

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is an even number, so thanks to modulo");
        } else {
            System.out.println("Number " + number + " is an odd number");
        }
    }

    public static void Task4() {

        int amountOfBricks = 43;

        int containerCapacity = 8;

        int fullContainers = amountOfBricks / containerCapacity;

        System.out.println("Here is sum of full containers: " + fullContainers);

        int totalContainers = (amountOfBricks + containerCapacity) / containerCapacity;

        System.out.println("Here is sum of total containers: " + totalContainers);

        System.out.println("We always have only one not full container!");

        int blocsInNotFullContainer = amountOfBricks % containerCapacity;

        System.out.println("Here is sum of blocs in not full container " + blocsInNotFullContainer);
    }

    public static void Task5(){



    }

}

