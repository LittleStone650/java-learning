package controflow;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgagePaymentsCalculatorExerciseWithCondition {
    public static void main(String[] args) {
        final int percent = 100;
        final int monthOfAnnual = 12;
        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float monthlyInterestRate = 0;
        int numPay = 0;

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal > 1000 && principal <= 1_000_000)
                break;
            else
                System.out.println("Enter a number between 1,000 and 1,000,000.");
        }


        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30){
                monthlyInterestRate = annualInterestRate / percent / monthOfAnnual;
                break;}
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }


        while (true) {
            System.out.print("Period (Years): ");
            int period = scanner.nextInt();
            if (period >= 1 && period <= 30) {
                numPay = period * monthOfAnnual;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numPay))
                / (Math.pow(1 + monthlyInterestRate, numPay) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);

        System.out.println("Mortgage: " + result);

    }

}





