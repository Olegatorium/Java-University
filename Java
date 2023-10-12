public class Main {
    public static void main(String[] args) {

        Mars mars = new Mars();

        mars.CalculateWeightOnMars();


    }
}

public class Mars {

   private float earthWeightNarbut = 70;

   private float marsWeightNarbut;

   public void CalculateWeightOnMars(){

       marsWeightNarbut = earthWeightNarbut % 38;
       System.out.println(earthWeightNarbut + " kg on Eart is " + marsWeightNarbut + " kg on Mars");

       double marsWeightDouble = (double)earthWeightNarbut % 38;
       System.out.println("kilograms on Mars after converting to double " + marsWeightDouble);

       int marsWeightInt = (int)earthWeightNarbut % 38;
       System.out.println("Kilograms on Mars casted to int " + marsWeightInt);

       char marsWeightChar = (char)marsWeightInt;

       System.out.println("ASCII " + marsWeightChar);

       int newVariable = marsWeightChar / 2;

       System.out.println("do any math operation on this variable char type and assign the value of this activity to the new\n" +
               "variable int type.    The result is " + newVariable);



   }
}
