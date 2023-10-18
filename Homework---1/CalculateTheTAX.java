import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        CompareVariables();
    }

    public static void CompareVariables(){

        /////////// Task1 - actions using double types ///////////

        System.out.println("Task1 - Here we are using double types! :");

        double priceInNet = 9.99;
        double vat = 1.23;

        System.out.println("A product costs " + priceInNet + " net");

        double priceIncludeVat = priceInNet * vat;

        System.out.println("Price of product include 23% Vat: " + priceIncludeVat);

        double priceForTenPcs = priceIncludeVat * 10.000;

        System.out.println("Price for 10 pcs of product include 23% Vat: " + priceForTenPcs);

        double tenPcsExcludeVat = priceForTenPcs - (priceForTenPcs * 0.23);

        System.out.println("Price for 10 pcs of product exclude 23% Vat: " + tenPcsExcludeVat);


        /////////// Task2 - above actions using the Big Decimal class ///////////

        System.out.println("\n\nTask2 - Here we are using the Big Decimal class! :");

        BigDecimal priceInNetD = new BigDecimal(9.99);
        BigDecimal vatD = new BigDecimal(1.23);

        System.out.println("A product costs " + priceInNetD + " net");

        BigDecimal priceIncludeVatD = priceInNetD.multiply(vatD);

        System.out.println("Price of product include 23% Vat: " + priceIncludeVatD);

        BigDecimal amountOfProducts = new BigDecimal(10.000);
        BigDecimal priceForTenPcsD = priceIncludeVatD.multiply(amountOfProducts);

        System.out.println("Price for 10 pcs of product include 23% Vat: " + priceForTenPcsD);

        BigDecimal subtractVatD = new BigDecimal(0.23);

        BigDecimal tenPcsExcludeVatD = priceForTenPcsD.subtract(priceForTenPcsD.multiply(subtractVatD));

        System.out.println("Price for 10 pcs of product exclude 23% Vat: " + tenPcsExcludeVatD);

        String conclusion = "My conclusion is that using BigDecimal calculates a more precise number." +
                "\nThis can be useful when you need to know the exact amount, for example, in banking.";

        String greenColor = "\u001B[32m";

        String resetColor = "\u001B[0m";

        System.out.println("\n" + greenColor + conclusion + resetColor);

    }

}