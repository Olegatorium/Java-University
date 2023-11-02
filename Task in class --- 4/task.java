import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

           Task5();
    }

    public static void Task1(){
        Scanner scanner = new Scanner(System.in);

        int[]numbers = new int[10];

        System.out.println("fill the array");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = scanner.nextInt();
        }

        System.out.println("Our Array:" );

        for (int item : numbers) {

            System.out.println(item);
        }
    }

    public static void Task2(){

        Random random = new Random();

        int[] myArray = new int[10];

        System.out.println("Our 10 numbers: ");

        for (int i = 0; i <myArray.length ; i++) {

            myArray[i] = random.nextInt(100) + 1;

            System.out.println(myArray[i]);
        }

        int largestNumber = myArray[0];
        int smallerNumber = myArray[0];

        for (int i = 0; i < myArray.length ; i++) {

            if (largestNumber < myArray[i])
            {
                largestNumber = myArray[i];
            }
            else if (smallerNumber > myArray[i])
            {
                smallerNumber = myArray[i];
            }
        }

        System.out.printf("\n\nour largest num " + largestNumber);
        System.out.println("\nour smaller num " + smallerNumber);

    }

    public static void Task3(){

        int sum = 0;

        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (i == j)
                {
                    matrix[i][j] = j;

                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Our array");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Sum of diagonal: " + sum);
    }

    public static void Task4(){

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();

        String second = scanner.nextLine();

        String temp = first;

        first = first.concat(second);

        System.out.println(first);

        System.out.println(first.contains(second));

    }
    
}
