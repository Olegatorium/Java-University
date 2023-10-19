import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2, 4, 7, 88},
                {1, 2, 4, 7, 44},
                {1, 2, 4, 7, 44},
                {33, 44, 63, 11, 44}
        };

        System.out.println("1. Двумерный массив:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print((i + 1) + ".Row, " + (j + 1) + ".Column: Number: " + myArray[i][j] + "\t");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rowCount = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int colCount = scanner.nextInt();

        int[][] array = new int[rowCount][colCount];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print("array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("2. Двумерный массив:");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][][] myArray1 = {
                {
                        {1, 2, 4, 7, 88},
                        {1, 2, 4, 7, 44},
                        {1, 2, 4, 7, 44},
                        {33, 44, 63, 11, 44}
                },
                {
                        {10, 20, 30, 40, 50},
                        {60, 70, 80, 90, 100},
                        {110, 120, 130, 140, 150},
                        {160, 170, 180, 190, 200}
                }
        };

        System.out.println("3. Трехмерный массив:");
        for (int i = 0; i < myArray1.length; i++) {
            System.out.println("Dimension " + (i + 1) + ":");
            for (int j = 0; j < myArray1[i].length; j++) {
                for (int k = 0; k < myArray1[i][j].length; k++) {
                    System.out.print((i + 1) + ".Dimension, " + (j + 1) + ".Row, " + (k + 1) + ".Column: Number: " + myArray1[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
