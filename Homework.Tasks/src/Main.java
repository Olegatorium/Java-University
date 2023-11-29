import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task2:
        //System.out.println("The sum of the numbers in the array is : " + CalcSumArray(new int[]{0,1,2,3,4}));

        //Task4:
        //System.out.println(Task4(123));

        //Task5:
        System.out.println(repFirstChar("Fweewf"));
    }

    public static void Task1(int n){

        String symbols = "";

        for (int i = 0; i < n/2; i++) {

            symbols +="+-";

        }

        if (n % 2 != 0) {
           symbols += "+";
        }

        System.out.println(symbols);
    }

    public static int CalcSumArray(int[] numbers){

        int result = 0;

        for (int i = 0; i < numbers.length; i++) {

            result += numbers[i];
        }

        return result;
    }

    public static void Task3(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the number which you want to check\nNumber cannot be less than 1 and greater than 100:");
        int n = scanner.nextInt();

        if(n < 1){
            return;
        }
        else if (n >100){
            return;
        }

        int count = 0;

        int[] numbers = new int[n];

        if (n %2 != 0) {
            n -=1;
            numbers[n] = 0;
        }

        for (int i = 0; i < n; i++) {

            count ++;

            if (count % 2 != 0) {

                numbers[i] = count;
                numbers[i+1] = count - (count*2);
            }
        }

        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " " );
        }
        System.out.print("]");
    }

    public static int Task4(int n){

        String numberString = Integer.toString(n);

        int[] numbers = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            numbers[i] = Character.getNumericValue(numberString.charAt(i));
        }

        Arrays.sort(numbers);

        String stringResult = "";

        for (int i = numbers.length - 1; i >= 0; i--) {

            stringResult += Integer.toString(numbers[i]);
        }

        int result = Integer.parseInt(stringResult);

        return result;
    }

    public static String repFirstChar(String s){

        char c = s.charAt(0);

        if (Character.isUpperCase(c)) {
            return "upper";
        }else if (Character.isLowerCase(c)) {
            return "lower";
        }else if (Character.isDigit(c)) {
            return "digit";
        } else {
            return "other";
        }
    }
}