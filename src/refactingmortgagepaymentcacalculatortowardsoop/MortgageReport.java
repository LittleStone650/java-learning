package refactingmortgagepaymentcacalculatortowardsoop;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currencyInstance;
    private MortgageCalcultor calculator;

    public MortgageReport(MortgageCalcultor calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------");
        NumberFormat currency = currencyInstance;
        for (double balance : calculator.getRemainningBalances()){
            String result1 = currency.format(balance);
            System.out.println(result1);
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        NumberFormat currency = currencyInstance;
        String result = currency.format(mortgage);
        System.out.println("Mortgage\n");
        System.out.println("----------------");
        System.out.println("Monthly Payments: " + result);
    }
}
