package codecleanwithcreatmethod;

import java.text.NumberFormat;
import java.util.Scanner;

public class RefactoringMortgagePaymentsCalculator {
    public static void main(String[] args) {

        int principal = (int) readNumber("Principal",1000,1000000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate ",1,30);
        int period = (int) readNumber("Period (years): ",1,30);

        printMortgage(principal, annualInterestRate, period);

        printPaymentSchedule(principal, annualInterestRate, period);

    }

    private static void printMortgage(int principal, float annualInterestRate, int period) {

        double mortgage = calculateMortgage(principal, annualInterestRate, period);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage);
        System.out.println("Mortgage\n");
        System.out.println("----------------");
        System.out.println("Monthly Payments: "  + result);
    }

    private static void printPaymentSchedule(int principal, float annualInterestRate, int period) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------");
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        for (short month = 1; month <= period *12; month++){
            double balance = calculateBalance(principal, annualInterestRate, period,month);
            String result1 = currency.format(balance);
            System.out.println(result1);
        }
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " +min + " and "+ max);
        }
        return value;
    }

    public static double calculateMortgage (
            int principal,
            float annualInterestRate,
            int period
            ){
        final int percent = 100;
        final int monthOfAnnual = 12;

        double monthlyInterestRate = annualInterestRate / percent / monthOfAnnual;
        int numPay = period * monthOfAnnual;

        double mortgage = principal *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numPay))
                / (Math.pow(1 + monthlyInterestRate, numPay) - 1);
        return mortgage;
    }
    public static double calculateBalance(
            int principal,
            float annualInterestRate,
            int period,
            short numberofPaymentsMade
    ){
        final int percent = 100;
        final int monthOfAnnual = 12;

        double monthlyInterestRate = annualInterestRate / percent / monthOfAnnual;
        int numPay = period * monthOfAnnual;

//        double p = calculateMortgage(principal,annualInterestRate,period);

        double balance = principal*(Math.pow(1+monthlyInterestRate,numPay)-Math.pow(1+monthlyInterestRate,numberofPaymentsMade))/
                (Math.pow(1+monthlyInterestRate,numPay)-1);

        return balance;
    }


}






