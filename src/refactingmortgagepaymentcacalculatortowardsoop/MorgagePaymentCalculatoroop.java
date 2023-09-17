package refactingmortgagepaymentcacalculatortowardsoop;

public class MorgagePaymentCalculatoroop {
    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal",1000,1000000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate ",1,30);
        int period = (int) Console.readNumber("Period (years): ",1,30);


        var calculator = new MortgageCalcultor(principal,annualInterestRate,period);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }

}
