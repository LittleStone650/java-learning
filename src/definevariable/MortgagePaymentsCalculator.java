package definevariable;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgagePaymentsCalculator {
    public static void main(String[] args) {
        final int percent = 100;
        final int monthOfAnnual = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate/percent/monthOfAnnual;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int numPay = period*monthOfAnnual;


        double mortgage = principal*
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,numPay))
                / (Math.pow(1+monthlyInterestRate,numPay) -1);



        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);

        System.out.println("Mortgage: "+result);


    }
}
