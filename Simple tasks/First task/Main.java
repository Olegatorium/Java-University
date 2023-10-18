public class Main {
    public static void main(String[] args) {

        int[] myArray = { 99, 5, 3, 117, 33 };

        int sum = 0;
        double avg = 0;
        int smallerValue = myArray[0];
        int biggerValue = myArray[0];

        for (int i = 0; i < myArray.length; i++) {

            sum += myArray[i];

            if (myArray[i] < smallerValue )
            {
                smallerValue = myArray[i];
            }
            else if (myArray[i] > biggerValue)
            {
                biggerValue = myArray[i];
            }

        }

        avg = (double)sum / myArray.length;

        System.out.println("sum is: " + sum);
        System.out.println("avg is: " + avg);
        System.out.println("smaller is: " + smallerValue);
        System.out.println("bigger is: " + biggerValue);

    }
}






