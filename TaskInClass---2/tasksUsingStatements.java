import java.util.Random;
import java.util.Scanner;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {

        Task5WithArray();

    }

    public static void Task1()
    {
        float firstNumber, secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");

        firstNumber = scanner.nextFloat();

        System.out.println("Enter the second number:");

        secondNumber = scanner.nextFloat();

        System.out.println("Your Results:");

        System.out.printf("Sum is: %.2f \n" , (firstNumber + secondNumber));
        System.out.printf("Difference is: %.2f \n" , (firstNumber - secondNumber));
        System.out.printf("Product is: %.2f \n" , (firstNumber * secondNumber));
        System.out.printf("Quotient is: %.2f \n" ,(firstNumber / secondNumber));

    }

    public static void Task2(){

        double height, weight;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height in meters:");

        height = scanner.nextFloat();

        System.out.println("Enter the weight in kilograms:");

        weight = scanner.nextFloat();

        double result = weight / (Math.pow(height, 2));

        System.out.println("Your BMI is: " + result);

        System.out.println("\nYour grade is:");

        if (result <= 16.00)
        {
               System.out.println("Starvation");
        }
        else if (result >= 16.00 && result <= 16.99)
        {
            System.out.println("Emaciation");
        }
        else if (result >= 17.00 && result <= 18.49)
        {
            System.out.println("Underweight");
        }
        else if (result >= 18.50 && result <= 22.99)
        {
            System.out.println("Normal, low range");
        }
        else if (result >= 23.00 && result <= 24.99)
        {
            System.out.println("Normal, high range");
        }
        else if (result >= 25.00 && result <= 27.49)
        {
            System.out.println("Owerweight, low range");
        }
        else if (result >= 27.50 && result <= 29.99)
        {
            System.out.println("Owerweight, high range");
        }
        else if (result >= 30.00 && result <= 34.99)
        {
            System.out.println("1st degree obesity");
        }
        else if (result >= 35.00 && result <= 39.99)
        {
            System.out.println("2st degree obesity");
        }
        else if (result >= 40.00)
        {
            System.out.println("3st degree obesity");
        }

    }

    public static void Task4(){

        int result = 0;

        for (int i = 0; i <=100 ; i++) {

            if (i %2 == 0){

                result += i;
            }
        }

        System.out.printf("\nYour result is: " + result);
    }

    public static void Task5(){

        Random random = new Random();

        int count = 0;

        int longest = 1;
        int smaller = 101;

        System.out.println("Our 10 numbers:");

        while (count < 10){
            count ++;

            int number = random.nextInt(100) + 1;

            System.out.println(number);

            if (number > longest)
            {
                longest = number;
            }
            else if (smaller > number)
            {
                smaller = number;
            }
        }

        System.out.printf("\nThe bigger: " + longest );
        System.out.printf("\nThe smaller: " + smaller );
    }

    public static void Task5WithArray(){

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
}

