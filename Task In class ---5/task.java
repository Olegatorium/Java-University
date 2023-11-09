 public static void Task(){

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int a = 0;
        int b = 0;

        int counter = 0;

        boolean sorted = true;

        for (int j = 0; j < numbers.length -1  ; j++) {

            sorted = false;

            counter ++;

            a = numbers[j];
            b = numbers[j + 1];

            if (a > b)
            {
                sorted = true;
                break;
            }

        }

            for (int j = 1; j < numbers.length && sorted; j++) {

                counter++;

                for (int i = 0; i < numbers.length - j; i++) {

                    counter ++;

                    if (numbers[i] > numbers[i + 1]) {
                        a = numbers[i];

                        b = numbers[i + 1];

                        numbers[i] = b;

                        numbers[i + 1] = a;

                        counter ++;
                    }

                }
            }



        for (int i = 0; i < numbers.length; i++) {

            System.out.printf(numbers[i]+ " ");
        }

        System.out.printf("\nNumber of action " + counter);
    }
